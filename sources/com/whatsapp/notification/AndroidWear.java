package com.whatsapp.notification;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0M4;
import X.AnonymousClass0RM;
import X.AnonymousClass1VX;
import X.AnonymousClass1n2;
import X.AnonymousClass2z0;
import X.AnonymousClass326;
import X.AnonymousClass3ZH;
import X.AnonymousClass5ZU;
import X.C03950Me;
import X.C04350Nw;
import X.C04480Ol;
import X.C05480Tm;
import X.C05610Ue;
import X.C107395bF;
import X.C107635bd;
import X.C113905mB;
import X.C159087l6;
import X.C18270x1;
import X.C18280x3;
import X.C30471mV;
import X.C32461qT;
import X.C42242Ni;
import X.C54122oD;
import X.C55832qz;
import X.C56362rr;
import X.C56652sL;
import X.C56682sO;
import X.C56842se;
import X.C58422vE;
import X.C60152y5;
import X.C619933b;
import X.C620633i;
import X.C620733j;
import X.C621033m;
import X.C624134x;
import X.C624735e;
import X.C626936e;
import X.C64773Ex;
import X.C66543Lv;
import X.C66553Lw;
import X.C69263Wi;
import X.C70123Zz;
import X.C71263bp;
import X.C71403c3;
import X.C95804uY;
import X.C95814uZ;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

public final class AndroidWear extends C32461qT {
    public static C159087l6 A0B;
    public static final String A0C;
    public static final String A0D = AnonymousClass000.A0X(".intent.action.MUTE_NEWSLETTER", AnonymousClass000.A0l("com.whatsapp"));
    public static final String A0E = AnonymousClass000.A0X(".intent.action.REACTION", AnonymousClass000.A0l("com.whatsapp"));
    public static final String A0F = AnonymousClass000.A0X(".intent.action.REPLY", AnonymousClass000.A0l("com.whatsapp"));
    public static final int[] A0G = {R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved};
    public C69263Wi A00;
    public C621033m A01;
    public C64773Ex A02;
    public C54122oD A03;
    public C113905mB A04;
    public C620633i A05;
    public C56652sL A06;
    public C56842se A07;
    public C619933b A08;
    public C60152y5 A09;
    public boolean A0A = false;

    public AndroidWear() {
        super("AndroidWear");
    }

    public static C05480Tm A00(Context context, AnonymousClass3ZH r6) {
        C04350Nw r1 = new C04350Nw(R.drawable.ic_notif_mark_read, context.getString(R.string.f11nameremoved), C624735e.A05(context, new Intent(A0C, AnonymousClass326.A00(r6), context, AndroidWear.class), 134217728));
        r1.A00 = 2;
        r1.A03 = false;
        return r1.A00();
    }

    public static C05480Tm A01(Context context, AnonymousClass3ZH r5, C624134x r6, String str, int i) {
        Intent intent = new Intent(A0E, AnonymousClass326.A00(r5).buildUpon().fragment(C18280x3.A0Y()).build(), context, AndroidWear.class);
        C107395bF.A00(intent, r6.A1J);
        intent.putExtra("reaction", str);
        C04350Nw r1 = new C04350Nw(i, str, C624735e.A05(context, intent, 0));
        r1.A00 = 8;
        r1.A03 = false;
        return r1.A00();
    }

    public final void A05(boolean z) {
        this.A08.A0B((C624134x) null, true, true, true, false, z, false);
    }

    public void onCreate() {
        Log.i("android-wear/onCreate");
        A04();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("android-wear/onDestroy");
        super.onDestroy();
    }

    public void onHandleIntent(Intent intent) {
        C69263Wi r4;
        Runnable runnable;
        C69263Wi r2;
        Runnable r1;
        if (intent != null) {
            Bundle A012 = AnonymousClass0RM.A01(intent);
            String str = null;
            if (AnonymousClass326.A01(intent.getData())) {
                C64773Ex r22 = this.A02;
                Uri data = intent.getData();
                C626936e.A0B(AnonymousClass326.A01(data));
                AnonymousClass3ZH A042 = r22.A04(ContentUris.parseId(data));
                if (A042 != null) {
                    if (A012 != null) {
                        CharSequence charSequence = A012.getCharSequence("android_wear_voice_input");
                        if (charSequence != null) {
                            str = charSequence.toString().trim();
                        }
                        if (!C107635bd.A0P(this.A05, this.A09, str)) {
                            Log.i("androidwear/voiceinputfromandroidwear/message is empty");
                            r2 = this.A00;
                            r1 = C71263bp.A00(this, 1);
                        } else {
                            r2 = this.A00;
                            r1 = new C71403c3(this, A042, str, 2);
                        }
                    } else if (C18280x3.A1V(intent, A0E)) {
                        String stringExtra = intent.getStringExtra("reaction");
                        AnonymousClass2z0 A022 = C107395bF.A02(intent);
                        if (stringExtra != null && A022 != null) {
                            r4 = this.A00;
                            runnable = new C71403c3(this, A022, stringExtra, 3);
                            r4.A0S(runnable);
                        }
                        return;
                    } else if (C18280x3.A1V(intent, A0C)) {
                        r2 = this.A00;
                        r1 = new C70123Zz(this, 21, A042);
                    } else if (C18280x3.A1V(intent, A0D)) {
                        C95814uZ A013 = AnonymousClass3ZH.A01(A042);
                        if (!(A013 instanceof C95804uY)) {
                            Log.e("androidwear/ACTION_MUTE_NEWSLETTER for non-newsletter jid/ignoring");
                            return;
                        }
                        C95804uY r23 = (C95804uY) A013;
                        this.A06.A09(r23, true);
                        this.A07.A08(r23);
                        A05(true);
                        return;
                    } else {
                        return;
                    }
                    r2.A0S(r1);
                    return;
                }
            }
            r4 = this.A00;
            runnable = C71263bp.A00(this, 0);
            r4.A0S(runnable);
        }
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("com.whatsapp");
        A0C = AnonymousClass000.A0X(".intent.action.MARK_AS_READ", A0o);
    }

    public static C04480Ol A02(Context context, Bitmap bitmap, AnonymousClass5ZU r21, C620733j r22, C66543Lv r23, C56362rr r24, AnonymousClass3ZH r25, AnonymousClass1VX r26, C56682sO r27, C66553Lw r28, C55832qz r29, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        CharSequence charSequence;
        CharSequence charSequence2;
        C04480Ol r0 = new C04480Ol();
        Context context2 = context;
        C56682sO r4 = r27;
        if (z) {
            C624134x r2 = r4.A00;
            if ((r2 instanceof AnonymousClass1n2) && ((C30471mV) r2).A01 != null) {
                C04480Ol r5 = new C04480Ol();
                r5.A05 = 4 | r5.A05;
                C05610Ue r1 = new C05610Ue(context2, (String) null);
                r5.A00(r1);
                r0.A0D.add(r1.A01());
            }
        }
        AnonymousClass3ZH r15 = r25;
        if (z2) {
            Class<C95814uZ> cls = C95814uZ.class;
            C42242Ni A0B2 = r23.A0B((C95814uZ) r15.A0I(cls), 20, 1, -1, true);
            Cursor cursor = A0B2.A00;
            CharSequence charSequence3 = "";
            if (cursor != null) {
                try {
                    if (cursor.moveToLast()) {
                        if (r24.A07((C95814uZ) r15.A0I(cls), A0B2.A02)) {
                            charSequence = TextUtils.concat(new CharSequence[]{charSequence3, "…"});
                        } else {
                            charSequence = charSequence3;
                        }
                        do {
                            C95814uZ r12 = (C95814uZ) r15.A0I(cls);
                            C626936e.A06(r12);
                            C624134x A042 = r29.A04(cursor, r12);
                            if (A042 == null || A042.A1I == 90) {
                                charSequence2 = charSequence3;
                            } else {
                                charSequence2 = r28.A0G(r15, A042, false, true, true);
                            }
                            if (charSequence2 != charSequence3) {
                                if (charSequence != charSequence3) {
                                    charSequence = TextUtils.concat(new CharSequence[]{charSequence, "\n\n"});
                                }
                                charSequence = TextUtils.concat(new CharSequence[]{charSequence, charSequence2});
                            }
                        } while (cursor.moveToPrevious());
                        charSequence3 = charSequence;
                    }
                } finally {
                    cursor.close();
                }
            }
            C05610Ue r6 = new C05610Ue(context2, (String) null);
            C18270x1.A0r(r6, charSequence3);
            C04480Ol r52 = new C04480Ol();
            r52.A05 = 8 | r52.A05;
            r52.A00(r6);
            r0.A0D.add(r6.A01());
        }
        if (z3) {
            String A0F2 = AnonymousClass002.A0F(context2, r21.A0H(r15), new Object[1], 0, R.string.f11nameremoved);
            String[] A0V = r22.A0V(A0G);
            if (Build.VERSION.SDK_INT >= 23) {
                str = "&#x1F603;";
                str2 = "&#x1F61E;";
            } else {
                str = ":-)";
                str2 = ":-(";
            }
            AnonymousClass0M4 r7 = new AnonymousClass0M4("android_wear_voice_input");
            r7.A00 = A0F2;
            String[][] strArr = {new String[]{str, str2}, A0V};
            int i = 0;
            int i2 = 0;
            do {
                i2 += strArr[i].length;
                i++;
            } while (i < 2);
            Object[] copyOf = Arrays.copyOf(strArr[0], i2);
            int length = strArr[0].length;
            String[] strArr2 = strArr[1];
            System.arraycopy(strArr2, 0, copyOf, length, strArr2.length);
            CharSequence[] charSequenceArr = (CharSequence[]) copyOf;
            r7.A01 = charSequenceArr;
            C03950Me r8 = new C03950Me(r7.A02, r7.A00, "android_wear_voice_input", r7.A03, charSequenceArr);
            Intent intent = new Intent(A0F, AnonymousClass326.A00(r15), context2, AndroidWear.class);
            int i3 = 134217728;
            C624735e.A06(intent, 134217728);
            if (C624735e.A01) {
                i3 = 167772160;
            }
            C04350Nw r210 = new C04350Nw(R.drawable.ic_full_reply, r8.A01, PendingIntent.getService(context2, 0, intent, i3));
            ArrayList arrayList = r210.A01;
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0s();
                r210.A01 = arrayList;
            }
            arrayList.add(r8);
            r0.A0C.add(r210.A00());
            if (r26.A0Y(C58422vE.A02, 2773)) {
                r0.A0C.add(A01(context2, r15, r4.A00, "👍", R.drawable.ic_notif_thumbs_up));
                r0.A0C.add(A01(context2, r15, r4.A00, "❤️", R.drawable.ic_notif_heart));
            }
        }
        r0.A0C.add(A00(context2, r15));
        Bitmap bitmap2 = bitmap;
        if (bitmap != null) {
            r0.A09 = bitmap2;
        }
        return r0;
    }
}
