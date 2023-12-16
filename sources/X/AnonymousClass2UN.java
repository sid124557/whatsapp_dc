package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2UN  reason: invalid class name */
public class AnonymousClass2UN {
    public final File A00;
    public final File A01;
    public final File A02;
    public final File A03;
    public final File A04;
    public final File A05;
    public final File A06;
    public final File A07;
    public final File A08;
    public final File A09;
    public final File A0A;
    public final File A0B;
    public final File A0C;
    public final File A0D;
    public final File A0E;
    public final File A0F;
    public final File A0G;
    public final File A0H;
    public final File A0I;
    public final File A0J;
    public final File A0K;
    public final File A0L;
    public final File A0M;
    public final File A0N;
    public final File A0O;
    public final File A0P;
    public final File A0Q;
    public final File A0R;
    public final /* synthetic */ C64393Dh A0S;

    public AnonymousClass2UN(C64393Dh r13) {
        this.A0S = r13;
        C183538qC r2 = r13.A02;
        File A0A2 = AnonymousClass002.A0A(AnonymousClass310.A00((AnonymousClass310) r2.get()), "Media");
        C64393Dh.A07(A0A2, false);
        this.A0A = A0A2;
        File A0A3 = AnonymousClass002.A0A(AnonymousClass310.A00((AnonymousClass310) r2.get()), ".Shared");
        C64393Dh.A07(A0A3, true);
        this.A03 = A0A3;
        Context context = r13.A01.A00;
        this.A09 = A00(context.getFilesDir(), ".Shared", false);
        File A002 = A00(A0A2, C64393Dh.A09, false);
        this.A01 = A002;
        File A003 = A00(A0A2, C64393Dh.A08, false);
        this.A00 = A003;
        this.A0P = A00(A0A2, C64393Dh.A0H, true);
        this.A0H = A00(A0A2, C64393Dh.A0E, true);
        String str = C64393Dh.A0G;
        File A004 = A00(A0A2, str, false);
        this.A0O = A004;
        String str2 = C64393Dh.A0C;
        File A005 = A00(A0A2, str2, false);
        this.A05 = A005;
        File A006 = A00(A0A2, C64393Dh.A0B, false);
        this.A02 = A006;
        this.A0Q = A00(A0A2, "WallPaper", false);
        this.A0G = A00(A0A2, C64393Dh.A0D, false);
        this.A0R = A00(A0A2, ".Links", true);
        this.A0N = A00(A0A2, ".Statuses", true);
        this.A08 = A00(context.getFilesDir(), "ViewOnce", true);
        this.A06 = A00(context.getFilesDir(), str2, true);
        this.A07 = A00(context.getFilesDir(), str, true);
        File A0A4 = AnonymousClass002.A0A(A0A2, C64393Dh.A0A);
        if (A0A4.exists()) {
            C627536m.A0P(A0A4);
            Log.i("fmessageio/initExternalStorageDirectory calls dir removed");
        }
        this.A0J = A00(A002, "Sent", true);
        this.A0I = A00(A003, "Sent", true);
        this.A0M = A00(A004, "Sent", true);
        this.A0L = A00(A005, "Sent", true);
        this.A0K = A00(A006, "Sent", true);
        this.A0C = A00(A002, "Private", true);
        this.A0B = A00(A003, "Private", true);
        this.A0F = A00(A004, "Private", true);
        this.A0E = A00(A005, "Private", true);
        this.A0D = A00(A006, "Private", true);
        this.A04 = A00(A0A2, C64393Dh.A0F, true);
    }

    public static File A00(File file, String str, boolean z) {
        File file2 = new File(file, str);
        C64393Dh.A07(file2, z);
        return file2;
    }
}
