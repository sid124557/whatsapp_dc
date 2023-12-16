package X;

import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.os.Build;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.36h  reason: invalid class name and case insensitive filesystem */
public class C627136h {
    public static final int A00 = 8;
    public static final int A01 = 20;
    public static final int A02 = 72;
    public static final int A03 = 108;
    public static final String A04 = "com.whatsapp.sharing.category.SHARE_TARGET_DEFAULT";
    public static final Set A05 = new C118415tV();

    public static int A00(Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            return 8;
        }
        return AnonymousClass0YP.A00(context);
    }

    public static ShortcutInfo A01(Context context, AnonymousClass5UX r9, C64773Ex r10, AnonymousClass5ZU r11, C613330g r12, C620633i r13, AnonymousClass3ZH r14, String str, int i) {
        Log.i("WaShortcutsApiHelper/createShortcutForContact");
        Context context2 = context;
        ShortcutInfo.Builder rank = new ShortcutInfo.Builder(context, AnonymousClass3ZH.A08(r14)).setShortLabel(str).setCategories(A05).setLongLived(true).setRank(i);
        Intent A1O = new C627736r().A1O(context, AnonymousClass3ZH.A01(r14), 0);
        AnonymousClass5VI.A01(A1O, "WaShortcutsHelper");
        ShortcutInfo.Builder intent = rank.setIntent(A1O.setAction("android.intent.action.VIEW"));
        Bitmap A032 = r12.A03(context2, r14, 0.0f, 72, true);
        if (A032 == null) {
            A032 = r9.A02(context2, 0.0f, r9.A00(r14), 72);
        }
        intent.setIcon(Icon.createWithAdaptiveBitmap(A02(A032)));
        if (r14.A0H instanceof PhoneUserJid) {
            intent.setPerson(new Person.Builder().setName(r11.A0H(r14)).setUri(A06(r10, r13, r14)).build());
        }
        return intent.build();
    }

    public static Bitmap A02(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(A03, A03, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        RectF rectF = new RectF(0.0f, 0.0f, 108.0f, 108.0f);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setColor(-1);
        canvas.drawRect(rectF, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, ((float) (canvas.getWidth() - bitmap.getWidth())) / 2.0f, ((float) (canvas.getHeight() - bitmap.getHeight())) / 2.0f, paint);
        return createBitmap;
    }

    public static C04440Of A03(C64773Ex r2, AnonymousClass5ZU r3, C620633i r4, AnonymousClass3ZH r5) {
        C03910Ma r1 = new C03910Ma();
        r1.A01 = r3.A0H(r5);
        r1.A03 = A06(r2, r4, r5);
        return new C04440Of(r1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0U1 A04(android.content.Context r11, X.C116985rC r12, X.AnonymousClass5UX r13, X.C64773Ex r14, X.AnonymousClass5ZU r15, X.C613330g r16, X.C620633i r17, X.AnonymousClass3ZH r18, int r19) {
        /*
            java.lang.String r0 = "WaShortcutsApiHelper/createShortcutCompatForContact"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9 = r18
            X.4uZ r6 = r9.A0H
            X.C626936e.A06(r6)
            java.lang.String r1 = r15.A0H(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0030
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "WaShortcutsApiHelper/createShortcutCompatForContact empty name for:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " type:"
            r1.append(r0)
            int r0 = r6.getType()
            X.C18260x0.A1G(r1, r0)
            r0 = 0
            return r0
        L_0x0030:
            java.lang.String r0 = r6.getRawString()
            X.0Vm r4 = new X.0Vm
            r8 = r11
            r4.<init>((android.content.Context) r11, (java.lang.String) r0)
            X.0U1 r3 = r4.A00
            r3.A0B = r1
            r0 = 1
            r3.A0N = r0
            r0 = r19
            r3.A02 = r0
            X.36r r1 = new X.36r
            r1.<init>()
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r9)
            r2 = 0
            android.content.Intent r1 = r1.A1O(r11, r0, r2)
            java.lang.String r0 = "WaShortcutsHelper"
            X.AnonymousClass5VI.A01(r1, r0)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = r1.setAction(r0)
            r0 = 1
            android.content.Intent[] r0 = new android.content.Intent[r0]
            r0[r2] = r1
            r3.A0P = r0
            java.lang.Object r0 = r12.A05()
            if (r0 == 0) goto L_0x009e
            boolean r0 = X.C155477ey.A00(r6)
            if (r0 == 0) goto L_0x009e
            r0 = 6
            java.lang.Integer[] r7 = new java.lang.Integer[r0]
            r0 = 1
            X.AnonymousClass000.A1P(r7, r0, r2)
            r6 = 3
            X.AnonymousClass000.A1P(r7, r6, r0)
            java.lang.Integer r1 = X.C18300x5.A0Y()
            r0 = 2
            r7[r0] = r1
            X.AnonymousClass000.A1P(r7, r0, r6)
            r0 = 13
            X.C18280x3.A1P(r7, r0)
            r0 = 20
            X.C18310x6.A1U(r7, r0)
            java.util.List r1 = X.AnonymousClass8UF.A0o(r7)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00de
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00de
        L_0x009e:
            java.util.Set r0 = A05
            r3.A0F = r0
        L_0x00a2:
            r11 = 72
            r10 = 0
            r12 = 1
            r7 = r16
            android.graphics.Bitmap r0 = r7.A03(r8, r9, r10, r11, r12)
            if (r0 != 0) goto L_0x00b6
            int r0 = r13.A00(r9)
            android.graphics.Bitmap r0 = r13.A02(r8, r10, r0, r11)
        L_0x00b6:
            android.graphics.Bitmap r6 = A02(r0)
            r6.getClass()
            r1 = 5
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>(r1)
            r0.A06 = r6
            r3.A09 = r0
            X.4uZ r0 = r9.A0H
            boolean r0 = r0 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x00d9
            r0 = r17
            X.0Of r1 = A03(r14, r15, r0, r9)
            X.0Of[] r0 = new X.C04440Of[r12]
            r0[r2] = r1
            r3.A0Q = r0
        L_0x00d9:
            X.0U1 r0 = r4.A00()
            return r0
        L_0x00de:
            java.util.Iterator r1 = r1.iterator()
        L_0x00e2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009e
            int r0 = X.C18280x3.A05(r1)
            if (r0 != 0) goto L_0x00a2
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C627136h.A04(android.content.Context, X.5rC, X.5UX, X.3Ex, X.5ZU, X.30g, X.33i, X.3ZH, int):X.0U1");
    }

    public static List A07(C56962sq r5, C64773Ex r6, C56982ss r7, C66473Lo r8, AnonymousClass30T r9, C56892sj r10) {
        Log.i("WaShortcutsApiHelper/getFrequentContacts");
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = r9.A01((C836949k) null, true).iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            AnonymousClass3ZH A07 = r6.A07(A0P);
            if (A07 != null && !r5.A0P(AnonymousClass32Y.A03(A0P)) && !r7.A0Q(A0P) && !(A0P instanceof C135216kJ) && !(A0P instanceof C135166kE)) {
                if (!A07.A0U() || r10.A0C((GroupJid) A0P)) {
                    A0s.add(A07);
                }
            }
        }
        boolean isEmpty = A0s.isEmpty();
        List list = A0s;
        if (isEmpty) {
            Log.i("WaShortcutsApiHelper/getFrequentContacts/get N contacts");
            List A032 = r8.A03(20);
            boolean isEmpty2 = A032.isEmpty();
            list = A032;
            if (isEmpty2) {
                Log.i("WaShortcutsApiHelper/getFrequentContacts/get contact picker list");
                r6.A0h(A032);
                list = A032;
            }
        }
        return A08(r7, list);
    }

    public static List A08(C56982ss r6, List list) {
        ArrayList A0I = AnonymousClass002.A0I(8);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            C95814uZ r1 = A0R.A0H;
            if (r1 != null && !C627336j.A0L(r1) && !r6.A0P(r1) && !(r1 instanceof C95804uY)) {
                A0I.add(A0R);
                if (A0I.size() >= 8) {
                    break;
                }
            }
        }
        return A0I;
    }

    public static void A0A(Context context) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        List<ShortcutInfo> shortcuts = shortcutManager.getShortcuts(8);
        ArrayList A0s = AnonymousClass001.A0s();
        for (ShortcutInfo id : shortcuts) {
            A0s.add(id.getId());
        }
        shortcutManager.removeLongLivedShortcuts(A0s);
    }

    public static synchronized void A0E(Context context, C116985rC r14, C55682qk r15, C56962sq r16, AnonymousClass5UX r17, C64773Ex r18, AnonymousClass5ZU r19, C613330g r20, C620633i r21, AnonymousClass5ZR r22, C56982ss r23, C66473Lo r24, AnonymousClass30T r25, C56892sj r26) {
        synchronized (C627136h.class) {
            C64773Ex r8 = r18;
            List A07 = A07(r16, r8, r23, r24, r25, r26);
            ArrayList A0s = AnonymousClass001.A0s();
            Context context2 = context;
            if (AnonymousClass000.A1T(r22.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA"))) {
                A0s.add(AnonymousClass3DP.A00(context));
            }
            int A002 = A00(context);
            int i = 0;
            while (true) {
                if (i < A07.size()) {
                    AnonymousClass0U1 A042 = A04(context2, r14, r17, r8, r19, r20, r21, (AnonymousClass3ZH) A07.get(i), i);
                    if (A042 != null) {
                        A0s.add(A042);
                        if (A002 == A0s.size()) {
                            break;
                        }
                    }
                    i++;
                }
            }
            try {
                A0K(context2, A0s);
            } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
                r15.A0A("WaShortcutsHelper/rebuildDynamicShortcuts", true, (String) null);
                Log.w("WaShortcutsHelper/exception happened. ", e);
            }
        }
        return;
    }

    public static synchronized void A0G(Context context, AnonymousClass5UX r14, C64773Ex r15, AnonymousClass5ZU r16, C613330g r17, C620633i r18, AnonymousClass3ZH r19, String str) {
        synchronized (C627136h.class) {
            Context context2 = context;
            List A032 = AnonymousClass0YP.A03(context);
            AnonymousClass3ZH r11 = r19;
            String str2 = str;
            if (A0M(A05(AnonymousClass3ZH.A08(r11), A032), str2)) {
                Log.i("WaShortcutsApiHelper/publishShortcut/shortcut already published");
            } else {
                AnonymousClass5UX r6 = r14;
                C64773Ex r7 = r15;
                AnonymousClass5ZU r8 = r16;
                C613330g r9 = r17;
                C620633i r10 = r18;
                ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(A01(context2, r6, r7, r8, r9, r10, r11, str2, Math.min(A032.size(), A00(context))));
            }
        }
    }

    public static void A0K(Context context, List list) {
        Log.i("WaShortcutsApiHelper/rebuild shortcut lists");
        AnonymousClass0YP.A05(context);
        int A002 = A00(context);
        if (list.size() > A002) {
            list = list.subList(0, A002);
        }
        AnonymousClass0YP.A07(context, list);
    }

    public static void A0L(Context context, List list) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager != null) {
            shortcutManager.disableShortcuts(list);
        }
    }

    public static boolean A0M(AnonymousClass0U1 r0, String str) {
        if (r0 == null || !r0.A0B.toString().equals(str)) {
            return false;
        }
        return true;
    }

    public static AnonymousClass0U1 A05(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0U1 r1 = (AnonymousClass0U1) it.next();
            if (r1.A0D.equals(str)) {
                return r1;
            }
        }
        return null;
    }

    public static String A06(C64773Ex r1, C620633i r2, AnonymousClass3ZH r3) {
        return AnonymousClass0x7.A0q(r1.A03(r3, r2.A0R()));
    }

    public static void A0H(Context context, AnonymousClass3ZH r3) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(AnonymousClass3ZH.A08(r3));
        A0L(context, A0s);
    }

    public static void A0I(Context context, C95814uZ r4) {
        String rawString = r4.getRawString();
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        for (ShortcutInfo shortcutInfo : shortcutManager.getShortcuts(8)) {
            if (shortcutInfo.getId().equals(rawString)) {
                shortcutManager.removeLongLivedShortcuts(Collections.singletonList(shortcutInfo.getId()));
                return;
            }
        }
    }

    public static void A09(Context context) {
        AnonymousClass0YP.A05(context);
    }
}
