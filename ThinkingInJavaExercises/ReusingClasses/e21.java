class e21{ 
    public static void main(String[] args){ 
        //main program here... 
    }
}

class A{
    final void test(){} 
}

class B extends A{
    @Override
    void test(){}//报错：被覆盖的方法为final
}
