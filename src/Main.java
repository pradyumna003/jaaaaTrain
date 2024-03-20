import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        // ********* STRINGS:
        //        String s1="Learning java programming";
//        System.out.println(s1.length());
//        System.out.println(s1.toLowerCase());
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.indexOf('a'));
//        System.out.println(s1.charAt(0));
//        System.out.println(s1.trim());
//        System.out.println(s1.);
// *************** ARRAYS:

// sort(),toString(),equals(),copyOf(),length();
//int arr[]={1,2,5234,3,3,4242,34,23};
//int arr2[]={10,20,30,40,23};
//Arrays.sort(arr);
//System.out.println(Arrays.toString(arr));
//
// ****************** FILE I/O
//        FileInputStream fs=new FileInputStream("path");
//        FileOutputStream fo=new FileOutputStream("path")

// COLLECTIONS: 1.
// **************ARRAYLIST : allows duplicate,maintain order of elements, used for sorting, dynamic size allocation. need to import util.ArrayList
//        ArrayList<Integer> al=new ArrayList<Integer>();
//        al.add(10);
//        al.add(20);
//        al.add(1);
//
//        System.out.println(al.size());
//        System.out.println(al.get(1));
//        System.out.println(al.remove(2));
//        System.out.println(al);


// **************** HashMap: stores data in key value pairs,can contain 1 null key but many null values,
        //it does not maintain order of elements, also multiple threads can access simultaneously.
        // it uses a technique called Hashing which converts a large string to a small string that represents the same string.
//        HashMap<Integer,String> hs=new HashMap<>();
//        hs.put(1,"value 1");
//        hs.put(2,"value2");
//        hs.put(3,"value3");
//        hs.put(3,"value4");
//        System.out.println(hs);
//
//        if(hs.containsKey(1)){
//            System.out.println(hs.get(1));
//        }
//
//        if(hs.isEmpty()){
//            System.out.println("hmap not empty");
//        }


// HASHSET:
// implements set interface, use hashtable to store data,duplicate values are not allowed,insertion order is not maintained
// null values are allowed, non synchronized.
//List<String> ls=new ArrayList<>();

//Maven: is a build automation tool specifically made for java and helps instance of 1. managing,building,deploying into different repositories
//                it mainly addresses how software is built and its dependicies.
//
//        POM.xml has all the configuration file
//
//        central and local repo  maven is going to manage both local and central repo if the plugin or libraries is not
//        present inthe local it will look for central
//
//        it is build around on central life cycle
//
//        3 Built in build lifecycle:
//        1. Default:handles project deployment 2. Clean handles project cleaning 3. Site handles project site documentation
//
//
//        maven has many built phases:
//        1.Default:
//        validate,compile,test,package,verify,install,deploy
//
//
//MAVEN Plugins:
//        plugin goal represents a specific task which contributes to building and managing a project
//
//        Settings.xml


//
//Git is an open source distributed version control system
//                it is used to track changes in any set of files




























    }

}