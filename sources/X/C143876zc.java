package X;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import com.whatsapp.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* renamed from: X.6zc  reason: invalid class name and case insensitive filesystem */
public class C143876zc extends Exception {
    public String a = "CLException";
    public String b;
    public String c;
    public Context d;

    public void A00(Context context, String str) {
        InputStream inputStream;
        Properties properties = new Properties();
        try {
            inputStream = context.getAssets().open("cl-messages_en_us.properties");
        } catch (IOException e) {
            Log.e(this.a, e.getLocalizedMessage());
            inputStream = null;
        }
        try {
            properties.load(inputStream);
        } catch (IOException e2) {
            Log.e(this.a, e2.getLocalizedMessage());
        }
        String property = properties.getProperty(str);
        String str2 = this.a;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ErrorMsg: ");
        AnonymousClass000.A1D(property, str2, A0o);
        String string = context.getResources().getString(R.string.f11nameremoved);
        Activity activity = (Activity) context;
        activity.findViewById(R.id.error_layout).setVisibility(0);
        ((TextView) activity.findViewById(R.id.error_message)).setText(string);
    }

    public C143876zc(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.d = context;
        A00(context, str2);
    }

    public C143876zc(Context context, String str, String str2, Throwable th) {
        super(th);
        this.b = str;
        this.c = str2;
        this.d = context;
        A00(context, str2);
    }
}
