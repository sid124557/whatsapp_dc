package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1RB  reason: invalid class name */
public class AnonymousClass1RB extends C18630y0 {
    public final C60972zT A00;
    public final C45932ao A01;

    public AnonymousClass1RB(C55682qk r4, C54292oU r5, C60972zT r6, C45932ao r7) {
        super(r5.A00, r4, "commerce.db", 1);
        this.A01 = r7;
        this.A00 = r6;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C626235v.A01(sQLiteDatabase, "cart_item");
        sQLiteDatabase.execSQL("CREATE TABLE cart_item(_id INTEGER PRIMARY KEY AUTOINCREMENT,business_id TEXT NOT NULL, product_id TEXT NOT NULL, product_title TEXT, product_price_1000 INTEGER, product_currency_code TEXT, product_image_id TEXT, product_scaled_image_url TEXT, product_quantity INTEGER, product_sale_price_1000 INTEGER, product_sale_start_date TIMESTAMP, product_sale_end_date TIMESTAMP, product_max_available INTEGER, product_variant_props TEXT, product_total_variant_quantity INTEGER)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS business_id_index on cart_item (business_id)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cart_applied_promotion(_id INTEGER PRIMARY KEY AUTOINCREMENT,business_id TEXT NOT NULL, promotion_id TEXT NOT NULL, promotion_name TEXT NOT NULL, promotion_discount TEXT NOT NULL, promotion_discount_type INTEGER NOT NULL, promotion_start_date TIMESTAMP, promotion_end_date TIMESTAMP, promotion_description TEXT NOT NULL, promotion_more_info TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS business_id_index_on_cart_applied_promotion ON cart_applied_promotion (business_id)");
    }

    public C56862sg A0F() {
        try {
            String databaseName = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName);
        } catch (SQLiteException e) {
            Log.e("failed to open writable commerce store", e);
            String databaseName2 = getDatabaseName();
            return C626135u.A00(super.A0A(), this.A00, this.A01, databaseName2);
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        String A012 = AnonymousClass350.A01(sQLiteDatabase, "cart_item");
        if (!TextUtils.isEmpty(A012)) {
            AnonymousClass350.A03(sQLiteDatabase, A012, "cart_item", "product_price_1000", "INTEGER");
            AnonymousClass350.A03(sQLiteDatabase, A012, "cart_item", "product_sale_price_1000", "INTEGER");
            AnonymousClass350.A03(sQLiteDatabase, A012, "cart_item", "product_sale_start_date", "TIMESTAMP");
            AnonymousClass350.A03(sQLiteDatabase, A012, "cart_item", "product_sale_end_date", "TIMESTAMP");
            AnonymousClass350.A03(sQLiteDatabase, A012, "cart_item", "product_max_available", "INTEGER");
            AnonymousClass350.A03(sQLiteDatabase, A012, "cart_item", "product_variant_props", "TEXT");
            AnonymousClass350.A03(sQLiteDatabase, A012, "cart_item", "product_total_variant_quantity", "INTEGER");
            AnonymousClass350.A02(sQLiteDatabase, "cart_item", "product_scaled_image_url", "TEXT");
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cart_applied_promotion(_id INTEGER PRIMARY KEY AUTOINCREMENT,business_id TEXT NOT NULL, promotion_id TEXT NOT NULL, promotion_name TEXT NOT NULL, promotion_discount TEXT NOT NULL, promotion_discount_type INTEGER NOT NULL, promotion_start_date TIMESTAMP, promotion_end_date TIMESTAMP, promotion_description TEXT NOT NULL, promotion_more_info TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS business_id_index_on_cart_applied_promotion ON cart_applied_promotion (business_id)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onCreate(sQLiteDatabase);
    }
}
