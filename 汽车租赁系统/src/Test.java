
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        HashMap<Integer, Car> map = new HashMap<>();

        map.put(1, new Car("跑车", "玛莎拉蒂", "鄂A8162C", 1500, "当前未被租赁"));
        map.put(2, new Car("客车", "金龙", "鄂A98C24", 1100, "当前未被租赁"));
        map.put(3, new Car("卡车", "东风", "鄂A785C2", 800, "当前未被租赁"));
        map.put(4, new Car("跑车", "兰博基尼", "鄂A88888", 3200, "当前未被租赁"));

        boolean f = true;
        while (f) {

            System.out.println("******************欢迎光临汽车租赁公司****************");
            System.out.println("1.汽车租赁\t\t2.汽车管理\t\t3.退出");
            System.out.println("**************************************************");
            System.out.print("请选择(1-3):");
            int num = sc.nextInt();

            switch (num) {
                case 1:

                    while (f) {
                        System.out.println("******************欢迎光临汽车租赁公司****************");
                        System.out.println("1.汽车租赁\t\t2.汽车管理\t\t3.退出");
                        System.out.println("**************************************************");

                        Set<Integer> keySet = map.keySet();
                        for (Integer integer : keySet) {
                            Car car = map.get(integer);
                            System.out.println(integer + ",车型: " + car.getType() + ",品牌: " + car.getBrand() + ",车牌: " + car.getNumberplate() + ",日租金: " + car.getRent());

                        }

                        System.out.println("请选择要租赁的汽车:");
                        int car = sc.nextInt();
                        System.out.println("请输入要租的天数:");
                        int day = sc.nextInt();

                        switch (car) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                Car car1 = map.get(car);
                                System.out.println("你要租赁的车为: " + car1.getType() + "," + car1.getNumberplate());
                                double money = car1.getRent() * day;
                                System.out.println("总租金为:" + money);
                                System.out.println("是否租用?请选择: 1.是  2.否");
                                int select = sc.nextInt();
                                if (select == 1) {
                                    System.out.println("恭喜你,租赁了" + car1.getBrand() + "车,车牌为:" + car1.getNumberplate() + ",总租金:" + money);
                                    Car car2 = map.get(car);
                                    car2.setZulin("当前已被租赁" + day + "天");
                                    f = false;
                                }

                                break;
                        }
                    }
                    f = true;
                    break;
                case 2:
                    while (f) {
                        System.out.println("********************欢迎进入汽车管理后台*********************");
                        System.out.println("1.添加汽车\t2.删除汽车\t3.修改汽车日租金\t4.查询汽车信息\t5.退出");
                        System.out.println("*********************************************************");

                        System.out.println("请选择(1-5):");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("请选择你要添加汽车类型:");
                                String genre = sc.next();
                                System.out.println("请输入汽车品牌:");
                                String pp = sc.next();
                                System.out.println("请输入汽车车牌号:");
                                String cph = sc.next();
                                System.out.println("请输入汽车日租金:");
                                double rzj = sc.nextDouble();

                                int size = map.size();
                                map.put(size + 1, new Car(genre, pp, cph, rzj, "当前未被租赁"));
                                System.out.println("添加成功!");
                                break;
                            case 2:
                                System.out.println("汽车列表:");
                                Set<Integer> keySet = map.keySet();
                                for (Integer integer : keySet) {
                                    Car car = map.get(integer);
                                    System.out.println(integer + ",车型: " + car.getType() + ",品牌: " + car.getBrand() + ",车牌: " + car.getNumberplate() + ",日租金: " + car.getRent() + "," + car.getZulin());
                                }

                                System.out.println("请选择要删除的汽车序号:");
                                int delete = sc.nextInt();
                                map.remove(delete);

                                System.out.println("删除成功!");
                                break;
                            case 3:
                                System.out.println("汽车列表:");
                                Set<Integer> keySet1 = map.keySet();
                                for (Integer integer : keySet1) {
                                    Car car = map.get(integer);
                                    System.out.println(integer + ",车型: " + car.getType() + ",品牌: " + car.getBrand() + ",车牌: " + car.getNumberplate() + ",日租金: " + car.getRent() + "," + car.getZulin());
                                }
                                System.out.println("请选择要修改的汽车序号:");
                                int revise = sc.nextInt();
                                System.out.println("请选择要修改的汽车日租金:");
                                double zj = sc.nextDouble();
                                Car car = map.get(revise);
                                car.setRent(zj);
                                System.out.println("修改成功!");
                                break;
                            case 4:
                                System.out.println("汽车列表:");
                                Set<Integer> keySet2 = map.keySet();
                                for (Integer integer : keySet2) {
                                    Car car1 = map.get(integer);
                                    System.out.println(integer + ",车型: " + car1.getType() + ",品牌: " + car1.getBrand() + ",车牌: " + car1.getNumberplate() + ",日租金: " + car1.getRent() + "," + car1.getZulin());
                                }
                                break;
                            case 5:
                                f = false;
                                break;
                        }
                    }
                    f=true;
                    break;

                case 3:
                    f = false;
                    break;
            }

        }
    }

    public static void addCar()
}
