package com.rahman.ProtobufExample2;

import com.abdur8312.protoFiles.Hello;
//import com.abdur8312.protoFiles.;

public class App
{
    public static void main( String[] args )
    {

        Hello.HelloWorld a = Hello.HelloWorld.newBuilder().setMessage("Hello world!").build();
        System.out.println(a.getMessage());




    }
}
