package java_ls.lr1.imutable;

import java.util.HashMap;

final class ImmutableClass {
    //final and private fields
    final private String name;
    final private int age;
    final private HashMap<String, Character> subjectGrade;

    //Values are assigned in constructor
    public ImmutableClass(String name,int age,HashMap<String, Character> subjectGrade){
        this.name = name;
        this.age = age;

        //deep copy of map
        HashMap<String, Character> temp = new HashMap<>();
        for(String k : subjectGrade.keySet()){
            temp.put(k, subjectGrade.get(k));
        }
        this.subjectGrade = temp;
    }

    // All getters
    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    //return clone in gettter method.

    public HashMap<String, Character> getSubjectGrade(){
        // As clone return object you have to typecast
        return (HashMap<String, Character>)subjectGrade.clone();
    }



}

