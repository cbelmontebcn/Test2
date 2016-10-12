

public class Switch01 {

    public static int getmyMonthNumber(String myMonth) {

        int myMonthNumber = 0;

        if (myMonth == null) {
            return myMonthNumber;
        }

        switch (myMonth.toLowerCase()) {
            case "january":
                myMonthNumber = 1;
                break;
            case "february":
                myMonthNumber = 2;
                break;
            case "march":
                myMonthNumber = 3;
                break;
            case "april":
                myMonthNumber = 4;
                break;
            case "may":
                myMonthNumber = 5;
                break;
            case "june":
                myMonthNumber = 6;
                break;
            case "july":
                myMonthNumber = 7;
                break;
            case "august":
                myMonthNumber = 8;
                break;
            case "september":
                myMonthNumber = 9;
                break;
            case "october":
                myMonthNumber = 10;
                break;
            case "november":
                myMonthNumber = 11;
                break;
            case "december":
                myMonthNumber = 12;
                break;
            default: 
                myMonthNumber = 0;
                break;
        }

        return myMonthNumber;
    }
    
    public void fetchURL() {
    	
    	
    	/*
    	URL url = new URL("https://graph.facebook.com/search?q=java&type=post");
    	try (InputStream is = url.openStream();
    	JsonReader rdr = Json.createReader(is)) {
    	
    	JsonObject obj = rdr.readObject();
    	JsonArray results = obj.getJsonArray("data");
    	for (JsonObject result : results.getValuesAs(JsonObject.class)) {
    	System.out.print(result.getJsonObject("from").getString("name"));
    	System.out.print(": ");
    	System.out.println(result.getString("message", ""));
    	System.out.println("-----------");
    	}
    	*/
    	
    }

    public static void main(String[] args) {

    	String myMonth = "";
    	
    	if (args.length > 0) {
    		myMonth = args[0];
    	}

        int returnedmyMonthNumber =
            Switch01.getmyMonthNumber(myMonth);

        if (returnedmyMonthNumber == 0) {
            System.out.println("Invalid myMonth");
        } else {
	    System.out.println("Month number for "+myMonth+" is "+returnedmyMonthNumber);
            System.out.println(returnedmyMonthNumber);
	    System.out.println("End of the world!");
        }
    }
}
