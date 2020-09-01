package com.example.shoepick;

        import android.content.ContentValues;
        import android.content.Context;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

        import androidx.annotation.Nullable;

        import java.util.ArrayList;
        import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String SHOE_TABLE = "SHOES";
    public static final String SHOE_NAME = "SHOE_NAME";
    public static final String ID = "ID";
    public static final String SHOE_TYPE = "SHOE_TYPE";
    public static final String SHOE_DURABILITY = "SHOE_DURABILITY";
    public static final String SHOE_MATERIAL = "SHOE_MATERIAL";
    public static final String SHOE_USE = "SHOE_USE";
    public static final String SHOE_SPORT = "SHOE_SPORT";
    public static final String SHOE_PRICE = "SHOE_PRICE";
    public static final String SHOE_RATING = "SHOE_RATING";
    //int id, String type, String durability, String material, String use, String sport
    public DataBaseHelper(@Nullable Context context) {
        super(context, "shoes.db", null, 1);
    }

    //first access
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + SHOE_TABLE + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + SHOE_NAME +
                " TEXT, " + SHOE_TYPE + " INT, " + SHOE_DURABILITY + " INT," + SHOE_MATERIAL + " INT, " + SHOE_USE + " INT, " +
                SHOE_SPORT + " INT, "+ SHOE_PRICE + " INT, "+ SHOE_RATING + " DOUBLE )";
        db.execSQL(createTableStatement);

    }
    //version change
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    public List<ShoeModel> getAll(){
        List<ShoeModel> returnList = new ArrayList<>();
        String queryString = "SELECT * FROM " + SHOE_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(queryString,null);
        if(cursor.moveToFirst()){
            //loop and create object


            do {
                int shoeID = cursor.getInt(0);
                String shoeName = cursor.getString(1);
                int shoeType = cursor.getInt(2);
                int shoeDurab = cursor.getInt(3);
                int shoeMat = cursor.getInt(3);
                int shoeUse = cursor.getInt(4);
                int shoeSport = cursor.getInt(5);
                int shoePrice = cursor.getInt(6);
                double shoeRating = cursor.getDouble(7);

                ShoeModel addShoe = new ShoeModel(shoeID, shoeName, shoeType, shoeDurab, shoeMat, shoeUse, shoeSport, shoePrice, shoeRating);
                returnList.add(addShoe);
            } while(cursor.moveToFirst());

        }else{
            //do not add

        }
        cursor.close();
        db.close();
        return returnList;
    }

    public boolean modRat(double rating, int id){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        return true;
    }
}
