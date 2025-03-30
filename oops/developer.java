package oops;
abstract class employee {
    String name;
    int id;
    double salary;

    abstract double CalculateBonus();

    public employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

class manager extends employee {
    int teamSize;

    public manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    double CalculateBonus() {
        return salary * 0.05 * teamSize;
    }
}

// public class developer extends employee {
//     String skilllevel;

//     public developer(String name, int id, double salary, String skilllevel) {
//         super(name, id, salary);
//         this.skilllevel = skilllevel;
//     }

//      double CalculateBonus() {
//         switch (skilllevel) {
//             case "junior":
//                  return salary * 0.05;
//             case "mid":
//                 return salary * 0.10;
//             case "senior":
//                 return salary *0.15;
//             default:
//             System.out.println("no bonus");
//              break;
//         }
//     }
// }
class Developer extends employee {
    String skillLevel;

        public Developer(String name, int id, double salary, String skillLevel) {
        super(name, id, salary);
        this.skillLevel = skillLevel;
    }
    @Override
     double CalculateBonus() {
        
        switch (skillLevel) {
            case "Beginner":
                return salary * 0.05;
            case "Intermediate":
                return salary * 0.1;
            case "Expert":
                return salary * 0.2;
            default:
                return 0.0;
        }
    }
}
class department{
    
}