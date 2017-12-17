class e23{
    public static void main(String[] args){
        //main program here... 
        A a1=new A();
        A a2=new A();
        A a3=new A();
        B b =new B();
        b.addU(a1.getU());
        b.addU(a2.getU());
        b.addU(a3.getU());
        b.callU();
        b.removeU(0);
        b.removeU(2);
        b.callU();
    }
}

interface U{
    void a();
    void b();
    void c();
}

class A{
    U getU(){
        return new U(){
            public void a(){
                System.out.println("a");
            }
            public void b(){
                System.out.println("b");
            }
            public void c(){
                System.out.println("c");
            }
        };
    }
}

class B{
    U[] uArray=new U[5];
    int i = 0;
    void addU(U u){
        if(i<uArray.length) {
            uArray[i] = u;
            i++;
        }
    }
    void removeU(int pos){
        uArray[pos]=null;
    }
    void callU(){
        for(int i=0;i<uArray.length;i++){
            if(uArray[i]!=null){
                uArray[i].a();
                uArray[i].b();
                uArray[i].c();
            }
        }
    }
}