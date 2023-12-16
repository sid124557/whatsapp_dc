package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.3DP  reason: invalid class name */
public class AnonymousClass3DP implements AnonymousClass66U {
    public final C116985rC A00;
    public final C55682qk A01;
    public final C69263Wi A02;
    public final C56972sr A03;
    public final C56962sq A04;
    public final AnonymousClass5UX A05;
    public final C64773Ex A06;
    public final AnonymousClass5ZU A07;
    public final C613330g A08;
    public final C620633i A09;
    public final C54292oU A0A;
    public final AnonymousClass5ZR A0B;
    public final AnonymousClass33p A0C;
    public final C56982ss A0D;
    public final C66473Lo A0E;
    public final AnonymousClass30T A0F;
    public final C56892sj A0G;
    public final AnonymousClass4FS A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r7 != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.content.Context r9, X.AnonymousClass3ZH r10, java.lang.String r11) {
        /*
            r8 = this;
            r6 = r10
            r7 = r11
            if (r11 != 0) goto L_0x000d
            X.5ZU r0 = r8.A07
            java.lang.String r7 = r0.A0H(r10)
            r2 = 0
            if (r7 == 0) goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x002a
            if (r2 == 0) goto L_0x002c
            java.lang.String r0 = "WaShortcutsHelper/publishShortcut"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5UX r1 = r8.A05
            X.3Ex r2 = r8.A06
            X.5ZU r3 = r8.A07
            X.33i r5 = r8.A09
            X.30g r4 = r8.A08
            r0 = r9
            X.C627136h.A0G(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x0029:
            return
        L_0x002a:
            if (r2 != 0) goto L_0x0029
        L_0x002c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "No valid display name for contact "
            java.lang.String r1 = X.AnonymousClass000.A0P(r10, r0, r1)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            com.whatsapp.util.Log.e(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DP.A04(android.content.Context, X.3ZH, java.lang.String):void");
    }

    public final AnonymousClass0U1 A01(AnonymousClass3ZH r13, boolean z, boolean z2) {
        Intent A072;
        Bitmap bitmap;
        Context context = this.A0A.A00;
        AnonymousClass3ZH r8 = r13;
        String A022 = C106815aD.A02(this.A07.A0H(r13));
        if (z2) {
            String A082 = AnonymousClass3ZH.A08(r13);
            A072 = C627736r.A08(context, 0);
            A072.setAction("android.intent.action.MAIN");
            A072.addFlags(335544320);
            A072.putExtra("jid", A082);
        } else {
            A072 = C18320x8.A07();
            A072.setAction("com.whatsapp.Conversation");
            A072.addFlags(335544320);
            A072.putExtra("jid", AnonymousClass3ZH.A08(r13));
        }
        A072.putExtra("displayname", A022);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        if (z) {
            bitmap = this.A08.A03(context, r8, C18310x6.A01(context), dimensionPixelSize, false);
            if (bitmap == null) {
                AnonymousClass5UX r1 = this.A05;
                bitmap = r1.A03(context, r1.A00(r13));
                if (!(bitmap.getWidth() == dimensionPixelSize && bitmap.getHeight() == dimensionPixelSize)) {
                    bitmap = Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, true);
                }
            }
        } else {
            bitmap = null;
        }
        AnonymousClass5VI.A01(A072, "ShortcutIntentHelper");
        C05920Vm r5 = new C05920Vm(context, AnonymousClass3ZH.A08(r13));
        AnonymousClass0U1 r12 = r5.A00;
        r12.A0P = new Intent[]{A072};
        r12.A0B = A022;
        if (bitmap != null) {
            r12.A09 = IconCompat.A03(bitmap);
        }
        return r5.A00();
    }

    public void A02() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            Log.i("WaShortcutsHelper/deletealldynamicshortcuts");
            Context context = this.A0A.A00;
            AnonymousClass0YP.A05(context);
            if (i >= 30) {
                Log.i("WaShortcutsHelper/deleteallcachedshortcuts");
                C627136h.A0A(context);
            }
        }
    }

    public void A03() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.A0H.BkN(new C70043Zq(this, 21), "WaShortcutsHelper/updateAppShortcuts");
        }
    }

    public void A05(AnonymousClass3ZH r5) {
        Context context = this.A0A.A00;
        AnonymousClass0U1 A012 = A01(r5, true, false);
        if (AnonymousClass0YP.A08(context)) {
            AnonymousClass0YP.A06(context, A012);
            if (Build.VERSION.SDK_INT >= 26) {
                return;
            }
        } else {
            Intent A013 = AnonymousClass0YP.A01(context, A012);
            A013.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
            context.sendBroadcast(A013);
        }
        this.A02.A0H(R.string.f11nameremoved, 1);
    }

    public void A06(AnonymousClass3ZH r4) {
        Context context = this.A0A.A00;
        if (Build.VERSION.SDK_INT >= 26) {
            C627136h.A0H(context, r4);
            return;
        }
        Intent A012 = AnonymousClass0YP.A01(context, A01(r4, false, false));
        A012.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
        context.sendBroadcast(A012);
    }

    public void A07(C95814uZ r3) {
        if (Build.VERSION.SDK_INT >= 30) {
            Log.i("WaShortcutsHelper/removeShortcutFromCache");
            C627136h.A0I(this.A0A.A00, r3);
        }
    }

    public void BMe() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (C56972sr.A04(this.A03) != null) {
                AnonymousClass33p r13 = this.A0C;
                if (C18280x3.A02(AnonymousClass0x2.A0F(r13), "sharing_shortcuts_version") != 1) {
                    Context context = this.A0A.A00;
                    C55682qk r15 = this.A01;
                    C56982ss r10 = this.A0D;
                    AnonymousClass5UX r9 = this.A05;
                    C64773Ex r8 = this.A06;
                    AnonymousClass5ZU r7 = this.A07;
                    C620633i r6 = this.A09;
                    C56962sq r5 = this.A04;
                    C116985rC r4 = this.A00;
                    AnonymousClass5ZR r3 = this.A0B;
                    AnonymousClass30T r2 = this.A0F;
                    C56892sj r1 = this.A0G;
                    C613330g r0 = this.A08;
                    C66473Lo r25 = this.A0E;
                    AnonymousClass5ZR r23 = r3;
                    C620633i r22 = r6;
                    C613330g r21 = r0;
                    AnonymousClass5ZU r20 = r7;
                    C64773Ex r19 = r8;
                    AnonymousClass5UX r18 = r9;
                    C56962sq r17 = r5;
                    C55682qk r16 = r15;
                    C116985rC r152 = r4;
                    Context context2 = context;
                    C627136h.A0E(context2, r152, r16, r17, r18, r19, r20, r21, r22, r23, r10, r25, r2, r1);
                    C18260x0.A0L(r13, "sharing_shortcuts_version", 1);
                }
            }
        }
    }

    public AnonymousClass3DP(C116985rC r2, C55682qk r3, C69263Wi r4, C56972sr r5, C56962sq r6, AnonymousClass5UX r7, C64773Ex r8, AnonymousClass5ZU r9, C613330g r10, C620633i r11, C54292oU r12, AnonymousClass5ZR r13, AnonymousClass33p r14, C56982ss r15, C66473Lo r16, AnonymousClass30T r17, C56892sj r18, AnonymousClass4FS r19) {
        this.A02 = r4;
        this.A0A = r12;
        this.A01 = r3;
        this.A0H = r19;
        this.A03 = r5;
        this.A0D = r15;
        this.A05 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A09 = r11;
        this.A04 = r6;
        this.A0B = r13;
        this.A00 = r2;
        this.A0C = r14;
        this.A0F = r17;
        this.A0G = r18;
        this.A08 = r10;
        this.A0E = r16;
    }

    public static AnonymousClass0U1 A00(Context context) {
        C05920Vm r4 = new C05920Vm(context, "open_camera");
        String string = context.getString(R.string.f11nameremoved);
        AnonymousClass0U1 r3 = r4.A00;
        r3.A0B = string;
        r3.A09 = IconCompat.A02(context.getResources(), context.getPackageName(), R.drawable.ic_shortcut_camera_alt);
        Intent A072 = C18320x8.A07();
        A072.setClassName(context.getPackageName(), "com.whatsapp.camera.LauncherCameraActivity");
        r3.A0P = new Intent[]{A072.addFlags(268435456).setAction("android.intent.action.VIEW")};
        return r4.A00();
    }

    public String BDW() {
        return "WaShortcutsHelper";
    }

    public /* synthetic */ void BMd() {
    }
}
