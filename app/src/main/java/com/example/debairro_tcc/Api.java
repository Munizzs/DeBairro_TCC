package com.example.debairro_tcc;

public class Api {

    private static final String ROOT_URL = "http://192.168.15.2/HeroApi/v1/Api.php?apicall=";

    public static final String URL_CREATE_PRODUTO = ROOT_URL + "createproduto";
    public static final String URL_READ_PRODUTOS = ROOT_URL + "getproduto";
    public static final String URL_UPDATE_PRODUTO = ROOT_URL + "updateproduto";
    public static final String URL_DELETE_PRODUTO = ROOT_URL + "deleteproduto&id=";
}
