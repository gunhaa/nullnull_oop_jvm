package mynote.localClass;

public class Local {
    static void testFunc(Object obj) {
        System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        int data = 10;
        data = 3;

        class Temp {
            public void doing() {
                
                // 해당 방식은 불가능하다
//                data = data + 3;
                // data 의 값이 변하는 경우도 불가능하다
                // data 값의 변경이 없는 상태라면 JVM이 final로 최적화 시키기 때문에 문제 없이 가능하다
//                int result = data + 1;
            }
        }

        System.out.println(data);
        int local = 20;
        class LocalClass {
            int localData;
            LocalClass() {
                localData = 10;
            }
            void printData() {
                System.out.println(this.localData);
                System.out.println(local);
            }
        }
        LocalClass localClass = new LocalClass();
        testFunc(localClass);
        // 현재는 큰 문제가 없다..
        // 하지만 스택프레임이 제거된 뒤 다시 접근해야 하면 어떻게 할 것인가?
        // JVM은 heap에 저장할때 익명 클래스로 만든뒤 필요한 지역 정보를 복사해 알아서 추가시킨다
        localClass.printData();
    }
}
