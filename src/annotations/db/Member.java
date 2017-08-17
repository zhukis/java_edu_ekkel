package annotations.db;

@DBTable(name = "MEMBER")
public class Member {
    @SQLString(30) String firstName;
    @SQLString(50) String lastName;
    @SQLInteger Integer age;

    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String handler;

    static int memberCount;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getHandler() {
        return handler;
    }

    public static int getMemberCount() {
        return memberCount;
    }
}
