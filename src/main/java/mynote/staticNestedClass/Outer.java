package mynote.staticNestedClass;

public class Outer {
    private int outerData = 5;
    private static int dataStatic = 10;

    int getInnerData() {
        Inner inner = new Inner();
        return inner.getInnerData();
    }

    int getInnerStaticData() {
        return Inner.inDataStatic;
    }

    int getOuterData() {
        return this.outerData;
    }

    // static으로 떠있기에 외부 this참조가 없다
    static class Inner {
        private int innerData = 50;
        private static int inDataStatic = 100;

        int getInnerData() {
            return innerData;
        }

        int getOuterDataStatic() {
            return Outer.dataStatic;
        }

        // OuterData는 불가능하다
//        int getOuterData() {
//            return Outer.outerData;
//        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.getInnerData());
        Outer.Inner outerInner = new Outer.Inner();
        System.out.println(outerInner.getOuterDataStatic());
        // 일반적인 static 필드와 다르게 this를 사용할 수 있다
        System.out.println(outerInner.getInnerData());
        System.out.println(outer.getInnerStaticData());
    }
}
