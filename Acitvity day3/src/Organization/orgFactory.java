package Organization;

public class orgFactory {
    public plan getPerc(String orgType) {
        if (orgType == null) {
            return null;
        }
        if (orgType.equalsIgnoreCase("PERMANENT")) {
            return new permanent();

        } else if (orgType.equalsIgnoreCase("CONTRACTUAL")) {
            return new contractual();
        }
        return null;
    }
    }
