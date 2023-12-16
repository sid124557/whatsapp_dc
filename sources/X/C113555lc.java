package X;

import android.content.Context;

/* renamed from: X.5lc  reason: invalid class name and case insensitive filesystem */
public final class C113555lc implements AnonymousClass4E8 {
    public final Context A00;

    public String BDW() {
        return "NativeLibLoaderDailyCron";
    }

    public void BQW() {
        Context context = this.A00;
        String str = new String[]{"vpx_1_8_1"}[0];
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("lib");
        A0o.append(str);
        String A0X = AnonymousClass000.A0X(".so", A0o);
        try {
            if (AnonymousClass002.A0A(context.getFilesDir(), A0X).delete()) {
                C18260x0.A0q("whatsapplibloader/cleanupOldLibraries deleting ", A0X, AnonymousClass001.A0o());
            }
        } catch (SecurityException unused) {
            C18260x0.A0q("whatsapplibloader/cleanupOldLibraries exception while cleaning up ", A0X, AnonymousClass001.A0o());
        }
    }

    public /* synthetic */ void BQX() {
    }

    public C113555lc(Context context) {
        this.A00 = context;
    }
}
