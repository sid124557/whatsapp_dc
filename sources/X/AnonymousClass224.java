package X;

import com.whatsapp.R;

/* renamed from: X.224  reason: invalid class name */
public enum AnonymousClass224 {
    GOOGLE_PAY("gpay", 0, R.drawable.ic_app_gpay),
    PHONE_PE("phonepe", 1, R.drawable.ic_app_phonepe),
    PAY_TM("paytm", 2, R.drawable.ic_app_paytm);
    
    public final int appIcon;
    public final String methodName;
    public final String packageName;

    /* access modifiers changed from: public */
    static {
        AnonymousClass224[] r0;
        A00 = C73653fr.A00(r0);
    }

    /* access modifiers changed from: public */
    AnonymousClass224(String str, int i, int i2) {
        this.packageName = r2;
        this.methodName = str;
        this.appIcon = i2;
    }
}
