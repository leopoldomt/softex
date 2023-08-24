package br.ufpe.cin.residencia.aula.heranca;

public class Heranca {
}


class A {
    private int x;
    protected int y;
    public int z;
}

class B extends A {

}

class C extends B {
    boolean y = true;

    public void m() {
        String y = "teste";
        System.out.println(y);
        System.out.print(this.y);
        System.out.print(super.y);

    }
}

class Name {
    int Name;

    Name Name(Name Name) {
        Name.Name = 137;
        return Name((Name) Name);
    }
}