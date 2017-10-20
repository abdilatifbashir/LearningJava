class e20{ 
    public static void main(String[] args){ 
        //main program here... 
    }
}

class A{
    private void test(){}
}

class B{
    @Override
    void test(){}//报错，无法覆盖或实现超类的方法
}