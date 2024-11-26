package com.example.myapplicationdg.data

import android.content.ContentValues
import android.content.Context
import com.example.myapplicationdg.jogo.personagens.Personagem
import org.example.racas.Anao
import org.example.racas.Humano
import org.example.racas.Raca
import racas.MeioElfo
import racas.MeioOrc
import racas.Draconato
import racas.Elfo
import racas.Gnomo
import racas.Halfling
import racas.Tiefling


// Classe responsável pelo controle de operações no banco de dados para o modelo Personagem
class PersonagemController(context: Context) {
    private val databaseHelper = Database(context)  // Instância do helper do banco de dados

    // Função para inserir um personagem no banco de dados
    fun insertPersonagem(personagem: Personagem, raca: String): Boolean {
        val db = databaseHelper.writableDatabase
        val value = ContentValues().apply {
            put("raca", raca)
            put("forca", personagem.forca)
            put("destreza", personagem.destreza)
            put("constituicao", personagem.constituicao)
            put("inteligencia", personagem.inteligencia)
            put("sabedoria", personagem.sabedoria)
            put("carisma", personagem.carisma)
            put("nome", personagem.nome)
            put("descricao", personagem.descricao)
            put("idade", personagem.idade)
            put("genero", personagem.genero)
            put("vida", personagem.vida)
        }

        // Insere os valores no banco de dados e verifica se a inserção foi bem-sucedida
        val result = db.insert("personagens", null, value)
        return result != -1L
    }

    // Função para buscar um personagem pelo ID
    fun getPersonagem(id: Int): Personagem? {
        val db = databaseHelper.readableDatabase
        val cursor = db.query(
            "personagens",
            arrayOf(
                "id",
                "raca",
                "forca",
                "destreza",
                "constituicao",
                "inteligencia",
                "sabedoria",
                "carisma",
                "nome",
                "descricao",
                "idade",
                "genero",
                "vida"
            ),
            "id = ?",
            arrayOf(id.toString()),
            null,
            null,
            null
        )

        // Verifica se encontrou resultados e cria um objeto Personagem a partir dos dados
        return if (cursor.moveToFirst()) {
            val racaPer = cursor.getString(cursor.getColumnIndexOrThrow("raca"))
            // Seleciona a raça do personagem com base no valor da coluna "raca"
            val racaAux: Raca = when (racaPer) {
                "Anao" -> Anao()
                "Draconato" -> Draconato()
                "Elfo" -> Elfo()
                "Gnomo" -> Gnomo()
                "Halfling" -> Halfling()
                "Humano" -> Humano()
                "MeioElfo" -> MeioElfo()
                "MeioOrc" -> MeioOrc()
                "Tiefling" -> Tiefling()

                else -> Anao()  // Valor padrão caso não haja correspondência

            }

            // Cria uma instância de Personagem e define os atributos usando os valores do banco de dados
            val personagem = Personagem(
                raca = racaAux
            )
            personagem.id = cursor.getInt(cursor.getColumnIndexOrThrow("id"))
            personagem.forca = cursor.getInt(cursor.getColumnIndexOrThrow("forca"))
            personagem.destreza = cursor.getInt(cursor.getColumnIndexOrThrow("destreza"))
            personagem.constituicao = cursor.getInt(cursor.getColumnIndexOrThrow("constituicao"))
            personagem.inteligencia = cursor.getInt(cursor.getColumnIndexOrThrow("inteligencia"))
            personagem.sabedoria = cursor.getInt(cursor.getColumnIndexOrThrow("sabedoria"))
            personagem.carisma = cursor.getInt(cursor.getColumnIndexOrThrow("carisma"))
            personagem.nome = cursor.getString(cursor.getColumnIndexOrThrow("nome"))
            personagem.descricao = cursor.getString(cursor.getColumnIndexOrThrow("descricao"))
            personagem.idade = cursor.getInt(cursor.getColumnIndexOrThrow("idade"))
            personagem.genero = cursor.getString(cursor.getColumnIndexOrThrow("genero"))
            personagem.vida = cursor.getInt(cursor.getColumnIndexOrThrow("vida"))
            cursor.close()
            personagem
        } else {
            cursor.close()
            null  // Retorna null se o personagem não foi encontrado
        }
    }

    // Função para atualizar os atributos de um personagem pelo ID
    fun update(id: Int, personagem: Personagem) {
        val db = databaseHelper.writableDatabase
        val values = ContentValues().apply {
            put("forca", personagem.forca)
            put("destreza", personagem.destreza)
            put("constituicao", personagem.constituicao)
            put("inteligencia", personagem.inteligencia)
            put("sabedoria", personagem.sabedoria)
            put("carisma", personagem.carisma)
            put("vida", personagem.vida)
        }

        val whereClause = "id = ?"
        val whereArgs = arrayOf(id.toString())

        // Atualiza os valores no banco de dados para o personagem específico
        db.update("personagens", values, whereClause, whereArgs)
    }

    // Função para deletar um personagem pelo ID
    fun deletePersonagem(id: Int): Boolean {
        val db = databaseHelper.writableDatabase
        val result = db.delete("personagens", "id=?", arrayOf(id.toString()))
        db.close()
        return result > 0 // Retorna true se a exclusão foi bem-sucedida
    }

    // Função para obter o maior ID presente na tabela de personagens
    fun getId(): Int? {
        val db = databaseHelper.readableDatabase
        var maxId: Int? = null
        val query = "SELECT MAX(id) FROM personagens"

        val cursor = db.rawQuery(query, null)
        if (cursor.moveToFirst()) {
            maxId = cursor.getInt(0)
        }
        cursor.close()
        db.close()

        return maxId  // Retorna o maior ID encontrado ou null se não houver registros
    }


}