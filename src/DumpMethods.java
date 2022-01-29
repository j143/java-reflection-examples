import java.lang.reflect.*;

class A {}

class instance1 {
    public static void main(String args[])
    {
        try {
            Class cls = Class.forName("A");
            boolean b1
                    = cls.isInstance(new Integer(37));
            System.out.println(b1);
            boolean b2 = cls.isInstance(new A());
            System.out.println(b2);
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}

class method1 {
    private int f1(
            Object p, int x) throws NullPointerException
    {
        if (p == null)
            throw new NullPointerException();
        return x;
    }

    public static void main(String args[])
    {
        try {
            Class cls = Class.forName("method1");

            Method methlist[]
                    = cls.getDeclaredMethods();
            for (int i = 0; i < methlist.length;
                 i++) {
                Method m = methlist[i];
                System.out.println("name = " + m.getName());
                        System.out.println("decl class = " +
                                m.getDeclaringClass());
                Class pvec[] = m.getParameterTypes();
                for (int j = 0; j < pvec.length; j++)
                    System.out.println("param #" + j + " " + pvec[j]);
                            Class evec[] = m.getExceptionTypes();
                for (int j = 0; j < evec.length; j++)
                    System.out.println("exc #" + j
                            + " " + evec[j]);
                System.out.println("return type = " +
                        m.getReturnType());
                System.out.println("-----");
            }
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}

class constructor1 {
    public constructor1() {
    }

    protected constructor1(int i, double d) {
    }

    public static void main(String args[]) {
        try {
            Class cls = Class.forName("constructor1");

            Constructor ctorlist[]
                    = cls.getDeclaredConstructors();
            for (int i = 0; i < ctorlist.length; i++) {
                Constructor ct = ctorlist[i];
                System.out.println("name = " + ct.getName());
                        System.out.println("decl class = " +
                                ct.getDeclaringClass());
                Class pvec[] = ct.getParameterTypes();
                for (int j = 0; j < pvec.length; j++)
                    System.out.println("param #"
                            + j + " " + pvec[j]);
                Class evec[] = ct.getExceptionTypes();
                for (int j = 0; j < evec.length; j++)
                    System.out.println(
                            "exc #" + j + " " + evec[j]);
                System.out.println("-----");
            }
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}

class field1 {
    private double d;
    public static final int i = 37;
    String s = "testing";

    public static void main(String args[])
    {
        try {
            Class cls = Class.forName("field1");

            Field fieldlist[]
                    = cls.getDeclaredFields();
            for (int i
                 = 0; i < fieldlist.length; i++) {
                Field fld = fieldlist[i];
                System.out.println("name = " + fld.getName());
                        System.out.println("decl class = " +
                                fld.getDeclaringClass());
                System.out.println("type = " + fld.getType());
                int mod = fld.getModifiers();
                System.out.println("modifiers = " +
                        Modifier.toString(mod));
                System.out.println("-----");
            }
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}

class method2 {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        try {
            Class cls = Class.forName("method2");
            Class partypes[] = new Class[2];
            partypes[0] = Integer.TYPE;
            partypes[1] = Integer.TYPE;
            Method meth = cls.getMethod(
                    "add", partypes);
            method2 methobj = new method2();
            Object arglist[] = new Object[2];
            arglist[0] = new Integer(37);
            arglist[1] = new Integer(47);
            Object retobj
                    = meth.invoke(methobj, arglist);
            Integer retval = (Integer)retobj;
            System.out.println(retval.intValue());
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}

class array2 {
    public static void main(String args[])
    {
        int dims[] = new int[]{5, 10, 15};
        Object arr
                = Array.newInstance(Integer.TYPE, dims);

        Object arrobj = Array.get(arr, 3);
        Class cls =
                arrobj.getClass().getComponentType();
        System.out.println(cls);
        arrobj = Array.get(arrobj, 5);
        Array.setInt(arrobj, 10, 37);

        int arrcast[][][] = (int[][][])arr;
        System.out.println(arrcast[3][5][10]);
    }
}

public class DumpMethods {
    public static void main(String args[]) {
        try {
            Class c = Class.forName(args[0]);
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++)
                System.out.println(m[i].toString());
        }
        catch (Throwable e) {
            System.err.println(e);
        }

    }

}