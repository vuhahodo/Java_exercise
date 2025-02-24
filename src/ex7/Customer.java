package ex7;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType; // "Premium", "Gold", "Silver", or null

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String type) {
        if (type.equalsIgnoreCase("premium") || type.equalsIgnoreCase("gold") || type.equalsIgnoreCase("silver")) {
            this.memberType = type;
            this.member = true;
        } else {
            this.memberType = null;
            this.member = false;
        }
    }

    @Override
    public String toString() {
        return "Customer[name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
    }
}
