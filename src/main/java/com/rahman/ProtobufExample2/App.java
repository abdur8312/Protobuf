package com.rahman.ProtobufExample2;

import com.abdur8312.protoFiles.Hello;
import com.abdur8312.protoFiles.Hello.HelloWorld;
import com.abdur8312.protoFiles.Personal;
import com.abdur8312.protoFiles.Personal.Information;
import com.abdur8312.protoFiles.WorldOuterClass;
import com.abdur8312.protoFiles.WorldOuterClass.World;

public class App 
{
    public static void main( String[] args )
    {
        
        
        Hello.HelloWorld a = HelloWorld.newBuilder().setMessage("Hello world!").build();
        System.out.println(a.getMessage());
        
        Personal.Information b = Information.newBuilder().setId(1).setName("abdur").setCity("chennai").build();
        System.out.println(b.toString());
        
        WorldOuterClass.World c = World.newBuilder().setFName("ABDUR").setLName("RAHMAN").build();
        System.out.println(c.toString());
        
    }
}
