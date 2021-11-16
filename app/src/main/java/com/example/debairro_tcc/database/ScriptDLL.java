package com.example.debairro_tcc.database;

public class ScriptDLL {

    public static String getCreateTableUsuario(){

        StringBuilder sql = new StringBuilder();

        sql.append("        CREATE TABLE IF NOT EXISTS USUARIO (   "  );
        sql.append("        EMAIL STRING PRIMARY KEY NOT NULL,     "  );
        sql.append("        SENHA VARCHAR (250) NOT NULL  (''),   "   );
        sql.append("        NOME VARCHAR (250) NOT NULL ('') , )   "  );
        sql.append("        SOBRENOME VARCHAR (250) NOT NULL ('') ,  ");
        sql.append("        NOUSUARIO VARCHAR (250) NOT NULL ('') ,  ");
        sql.append("        TIUSUARIO VARCHAR (250) NOT NULL ('') ,  ");
        sql.append("        TELEFONE  VARCHAR (20) NOT NULL  ('') ,  ");


        return sql.toString();

    }
}
