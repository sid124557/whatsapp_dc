package X;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.36l  reason: invalid class name */
public class AnonymousClass36l {
    public static String A00 = "";

    public static int A00(String str, String str2) {
        int length;
        int length2;
        if (str == null || str2 == null || (length = str.length()) < 6 || (length2 = str2.length()) < 6) {
            return -1;
        }
        int i = length - 6;
        int i2 = length2 - 6;
        int i3 = 0;
        int i4 = 0;
        do {
            if (str.charAt(i + i3) != str2.charAt(i2 + i3)) {
                i4++;
            }
            i3++;
        } while (i3 < 6);
        return i4;
    }

    public static Dialog A03(C89654ea r14, AnonymousClass5WY r15, C620733j r16, C53202mi r17, Runnable runnable, String str, String str2) {
        Runnable runnable2 = runnable;
        boolean A1W = AnonymousClass000.A1W(runnable2);
        Log.w(AnonymousClass000.A0b("RegistrationUtils/createUserIsBannedDialog/ban cancelable=", AnonymousClass001.A0o(), A1W));
        String str3 = str;
        String str4 = str2;
        String A0I = r16.A0I(A0C(str3, str4));
        StringBuilder A0l = AnonymousClass000.A0l(A0I);
        A0l.append("\n\n");
        AnonymousClass0x2.A0s(r14, A0l, R.string.f11nameremoved);
        SpannableString spannableString = new SpannableString(A0l.toString());
        spannableString.setSpan(new StyleSpan(1), 0, A0I.length() + 2, 33);
        C19340zH A002 = C19340zH.A00(r14, spannableString);
        A002.A0i(A1W);
        String string = r14.getString(R.string.f11nameremoved);
        AnonymousClass69T r0 = new AnonymousClass69T(r14, 17, runnable2);
        AnonymousClass0Uj r1 = A002.A00;
        r1.A0G(r0, string);
        r1.A0I(new AnonymousClass378(r14, r15, r17, runnable2, str3, str4), r14.getString(R.string.f11nameremoved));
        return A002.create();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r7.A05 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass043 A08(X.C111095hX r21, X.C89654ea r22, X.C69263Wi r23, X.AnonymousClass5WY r24, X.C620733j r25, X.C53202mi r26, X.C108565dC r27, java.lang.Runnable r28, java.lang.String r29, java.lang.String r30) {
        /*
            r10 = 0
            r7 = r27
            if (r27 == 0) goto L_0x00d9
            java.lang.String r0 = r7.A04
        L_0x0007:
            int r2 = X.C385828g.A00(r0)
            r12 = 1
            r4 = 0
            if (r27 == 0) goto L_0x0014
            boolean r0 = r7.A05
            r13 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r13 = 0
        L_0x0015:
            r14 = r28
            boolean r9 = X.AnonymousClass000.A1W(r14)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RegistrationUtils/createSMBUsersIsBannedViewPolicyDialog/ban cancelable="
            java.lang.String r0 = X.AnonymousClass000.A0b(r0, r1, r9)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r6 = r29
            r5 = r30
            java.lang.String r0 = A0C(r6, r5)
            r8 = r25
            java.lang.String r11 = r8.A0I(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            java.lang.String r0 = "\n\n"
            r1.append(r0)
            r15 = r22
            X.AnonymousClass0x2.A0s(r15, r1, r2)
            java.lang.String r0 = r1.toString()
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r0)
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r12)
            int r0 = r11.length()
            int r1 = r0 + 2
            r0 = 33
            r3.setSpan(r2, r4, r1, r0)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r15)
            r0 = 2131625454(0x7f0e05ee, float:1.8878116E38)
            android.view.View r1 = r1.inflate(r0, r10)
            X.0zH r3 = X.C19340zH.A00(r15, r3)
            r3.A0a(r1)
            r3.A0i(r9)
            r0 = 2131428328(0x7f0b03e8, float:1.8478297E38)
            android.widget.TextView r9 = X.C18300x5.A0G(r1, r0)
            r0 = 2131428326(0x7f0b03e6, float:1.8478293E38)
            android.widget.TextView r2 = X.C18300x5.A0G(r1, r0)
            r0 = 2131428327(0x7f0b03e7, float:1.8478295E38)
            android.widget.TextView r1 = X.C18300x5.A0G(r1, r0)
            r9.setVisibility(r4)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r9.setText(r0)
            r2.setVisibility(r4)
            r0 = 2131892976(0x7f121af0, float:1.9420715E38)
            r2.setText(r0)
            r1.setVisibility(r4)
            r0 = 2131892977(0x7f121af1, float:1.9420718E38)
            if (r13 == 0) goto L_0x00a4
            r0 = 2131895782(0x7f1225e6, float:1.9426407E38)
        L_0x00a4:
            r1.setText(r0)
            r0 = 15
            X.C634339f.A00(r9, r15, r14, r0)
            r22 = 3
            X.39n r0 = new X.39n
            r19 = r21
            r21 = r23
            r16 = r0
            r17 = r7
            r18 = r8
            r20 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.setOnClickListener(r0)
            X.5es r13 = new X.5es
            r16 = r24
            r17 = r26
            r19 = r5
            r20 = r4
            r18 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r1.setOnClickListener(r13)
            X.043 r0 = r3.create()
            return r0
        L_0x00d9:
            r0 = r10
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36l.A08(X.5hX, X.4ea, X.3Wi, X.5WY, X.33j, X.2mi, X.5dC, java.lang.Runnable, java.lang.String, java.lang.String):X.043");
    }

    public static long A01(String str, long j) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e) {
                Log.w((Throwable) e);
            }
        }
        return j;
    }

    public static Dialog A02(C89654ea r6, AnonymousClass5WY r7, C29441ip r8, C620633i r9, AnonymousClass5ZR r10, C53202mi r11, C56912sl r12, AnonymousClass4FS r13) {
        Log.i("RegistrationUtils/createCannotConnectDialog");
        C19340zH A002 = AnonymousClass5V0.A00(r6);
        C19340zH.A01(r6, A002, R.string.f11nameremoved);
        String string = r6.getString(R.string.f11nameremoved);
        AnonymousClass37A r5 = new AnonymousClass37A(r6, r7, r8, r9, r10, r11, r12, r13);
        AnonymousClass0Uj r3 = A002.A00;
        r3.A0I(r5, string);
        r3.A0G(new C1235268t(r6, 96), r6.getString(R.string.f11nameremoved));
        A002.A0V(new C107915c7());
        return A002.create();
    }

    public static Dialog A04(C89654ea r10, AnonymousClass5WY r11, C53202mi r12, String str, String str2) {
        Log.w("RegistrationUtils/createUnderageAccountBannedDialog/underage-ban cancelable=");
        C19340zH A002 = AnonymousClass5V0.A00(r10);
        A002.A0h(r10.getString(R.string.f11nameremoved));
        C19340zH.A01(r10, A002, R.string.f11nameremoved);
        A002.A0i(false);
        String string = r10.getString(R.string.f11nameremoved);
        C1235268t r0 = new C1235268t(r10, 92);
        AnonymousClass0Uj r1 = A002.A00;
        r1.A0I(r0, string);
        C53202mi r5 = r12;
        r1.A0H(new C85764Hn(r5, r11, r10, str, str2, 1), r10.getString(R.string.f11nameremoved));
        return A002.create();
    }

    public static ProgressDialog A06(Context context, CharSequence charSequence) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(charSequence);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public static AnonymousClass043 A07(Context context) {
        Log.i("RegistrationUtils/createVerificationCompleteDialog");
        if (C111095hX.A02(context).isFinishing()) {
            return null;
        }
        C19340zH A002 = AnonymousClass5V0.A00(context);
        A002.A0a(View.inflate(context, R.layout.f8nameremoved, (ViewGroup) null));
        return A002.create();
    }

    public static String A0A(C106175Xx r3, String str, String str2) {
        String str3;
        String replaceAll = str2.replaceAll("\\D", "");
        try {
            str3 = r3.A02(Integer.parseInt(str), replaceAll);
        } catch (IOException e) {
            Log.e("RegistrationUtils/prettyPrintFromSim/number/trim/error", e);
            str3 = null;
        }
        if (str3 != null) {
            return A0C(str, C18320x8.A0f(str, replaceAll));
        }
        return replaceAll;
    }

    public static String A0C(String str, String str2) {
        String str3;
        if (str == null || str2 == null) {
            Log.e("RegistrationUtils/prettyPrintFullPhoneNumber/cc-or-phnum-is-null");
            return null;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("+");
        A0o.append(str);
        String A0V = AnonymousClass000.A0V(" ", str2, A0o);
        C162167rN A002 = C162167rN.A00();
        try {
            return A002.A0H(C141026uu.INTERNATIONAL, A002.A0F(C18260x0.A06("+", str, str2), "ZZ"));
        } catch (Exception e) {
            e = e;
            str3 = "RegistrationUtils/prettyPrintFullPhoneNumber/formatter-exception";
            Log.e(str3, e);
            return A0V;
        } catch (ExceptionInInitializerError e2) {
            e = e2;
            str3 = "RegistrationUtils/prettyPrintFullPhoneNumber/formatter-init-exception";
            Log.e(str3, e);
            return A0V;
        }
    }

    public static void A0F(Activity activity, AnonymousClass33p r7, C54412og r8, Runnable runnable, String str) {
        Log.i("RegistrationUtils/showLoginFailedDialog");
        C19340zH A002 = AnonymousClass5V0.A00(activity);
        A002.A0i(false);
        A002.A0U(R.string.f11nameremoved);
        A002.A0g(C02890Hz.A00(AnonymousClass002.A0F(activity, C18280x3.A0Z(AnonymousClass0x2.A0F(r7), "account_switching_logged_out_phone_number"), AnonymousClass002.A0L(), 0, R.string.f11nameremoved)));
        A002.A0Y(new C1235268t(runnable, 93), R.string.f11nameremoved);
        A002.A0W(new AnonymousClass376(activity, r7, r8, runnable, str), R.string.f11nameremoved);
        A002.A0S();
    }

    public static void A0H(Context context, AnonymousClass33T r11, int i) {
        Log.i("RegistrationUtils/notifyNotVerified");
        long currentTimeMillis = System.currentTimeMillis();
        String A0F = AnonymousClass002.A0F(context, context.getString(R.string.f11nameremoved), new Object[1], 0, R.string.f11nameremoved);
        String string = context.getString(R.string.f11nameremoved);
        String string2 = context.getString(R.string.f11nameremoved);
        Intent A08 = AnonymousClass0x9.A08(context, context.getClass());
        if (i != -1) {
            A08.putExtra("com.whatsapp.verifynumber.dialog", i);
        }
        A08.addFlags(536870912);
        C18260x0.A1P(AnonymousClass001.A0o(), "RegistrationUtils/notifyNotVerified/", A08);
        PendingIntent A04 = C624735e.A04(context, A08, 0);
        C05610Ue A01 = C66553Lw.A01(context);
        A01.A0K = "critical_app_alerts@1";
        A01.A0C(A0F);
        A01.A05(currentTimeMillis);
        C18270x1.A0s(A01, string, string2);
        AnonymousClass33T.A01(A04, A01);
        AnonymousClass33T.A03(A01, r11, 1);
    }

    public static void A0I(Context context, AnonymousClass33T r11, AnonymousClass317 r12, boolean z) {
        Intent A07;
        Log.i("RegistrationUtils/notifyVerified");
        long currentTimeMillis = System.currentTimeMillis();
        String A0F = AnonymousClass002.A0F(context, context.getString(R.string.f11nameremoved), new Object[1], 0, R.string.f11nameremoved);
        String string = context.getString(R.string.f11nameremoved);
        String string2 = context.getString(R.string.f11nameremoved);
        if (z) {
            A07 = C627736r.A03(context);
        } else {
            A07 = C18320x8.A07();
            A07.setClassName(context.getPackageName(), "com.whatsapp.registration.RegisterName");
            r12.A0B(2, true);
        }
        PendingIntent A002 = C624735e.A00(context, 1, A07, 0);
        C05610Ue A003 = C66553Lw.A00(context);
        A003.A0C(A0F);
        A003.A05(currentTimeMillis);
        C18270x1.A0s(A003, string, string2);
        AnonymousClass33T.A01(A002, A003);
        AnonymousClass33T.A03(A003, r11, 1);
    }

    public static void A0J(Context context, C60152y5 r2) {
        Log.i("RegistrationUtils/clearAllRegistrationPref");
        SharedPreferences.Editor A002 = C60152y5.A00(r2, AnonymousClass317.A00(context, "com.whatsapp.registration.RegisterPhone"));
        A002.clear();
        if (!A002.commit()) {
            Log.w("RegistrationUtils/clearAllRegistrationPref/failed");
        }
    }

    public static void A0L(C89654ea r2, int i) {
        AnonymousClass5UF r1 = new AnonymousClass5UF(r2);
        r1.A01 = R.drawable.permission_sms;
        r1.A0D = new String[]{"android.permission.RECEIVE_SMS"};
        r1.A02 = R.string.f11nameremoved;
        r1.A07 = true;
        r2.BpY(r1.A02(), i);
    }

    public static void A0M(C89644eZ r2, AnonymousClass1VW r3, int i) {
        if (r3.A0Y(C58422vE.A02, 6290)) {
            AnonymousClass0x2.A0q(r2, C005205m.A01(r2, i), R.color.f5nameremoved);
        }
    }

    public static void A0N(C54292oU r3, AnonymousClass33p r4, AnonymousClass1VW r5, C184568s9 r6) {
        if (r5.A0Y(C58422vE.A02, 6320)) {
            ConnectivityManager connectivityManager = (ConnectivityManager) r3.A00.getSystemService("connectivity");
            NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).addCapability(12).build();
            if (C107385bE.A04()) {
                connectivityManager.requestNetwork(build, new AnonymousClass6DN(r4, r6), 15000);
                return;
            } else {
                Log.i("RegistrationUtils/maybeExecuteRequestOnCellular/Less than SDK 26");
                r4.A1X("silent_auth_sdk_under_26");
            }
        }
        r6.Ben();
    }

    public static void A0O(AnonymousClass33p r1, String str) {
        A00 = str;
        C18270x1.A0j(C18270x1.A03(r1), "registration_failure_reason", str);
    }

    public static Dialog A05(C89654ea r6, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        View A0H = C18310x6.A0H(LayoutInflater.from(r6), R.layout.f8nameremoved);
        C19340zH A002 = AnonymousClass5V0.A00(r6);
        A002.A0T(R.string.f11nameremoved);
        A002.A0a(A0H);
        A002.A0i(false);
        TextView A0G = C18300x5.A0G(A0H, R.id.button3);
        TextView A0G2 = C18300x5.A0G(A0H, R.id.button1);
        TextView A0G3 = C18300x5.A0G(A0H, R.id.button2);
        A0G.setVisibility(0);
        A0G.setText(R.string.f11nameremoved);
        C634339f.A00(A0G, r6, runnable, 14);
        A0G3.setVisibility(0);
        A0G3.setText(R.string.f11nameremoved);
        AnonymousClass0x2.A0q(r6, A0G3, R.color.f5nameremoved);
        C634339f.A00(A0G3, r6, runnable3, 17);
        A0G2.setVisibility(0);
        A0G2.setText(R.string.f11nameremoved);
        C634339f.A00(A0G2, r6, runnable2, 18);
        return A002.create();
    }

    public static CharSequence A09(C89644eZ r7, C620733j r8, String str, int i, long j, boolean z) {
        if (j > 3600000) {
            Spanned A0B = AnonymousClass0x9.A0B(AnonymousClass0x2.A0Y(r7.getResources(), (int) Math.ceil(((double) j) / 3600000.0d), 0, i));
            String obj = A0B.toString();
            SpannableString spannableString = new SpannableString(obj);
            for (Object obj2 : A0B.getSpans(0, obj.length(), Object.class)) {
                spannableString.setSpan(new StyleSpan(1), A0B.getSpanStart(obj2), A0B.getSpanEnd(obj2), 18);
            }
            return spannableString;
        }
        Locale A02 = C620733j.A02(r8);
        if (z) {
            Object[] A1X = AnonymousClass0x9.A1X();
            A1X[0] = str;
            A1X[1] = "  ";
            A1X[2] = C107565bW.A0A(r8, C18290x4.A0B(j));
            return String.format(A02, "%s%s%s", A1X);
        }
        return AnonymousClass0x9.A0B(String.format(A02, str, new Object[]{C107565bW.A0A(r8, C18290x4.A0B(j))}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r5.equals(r4) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0B(X.C106175Xx r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r8 = 0
            if (r0 != 0) goto L_0x004e
            int r1 = r12.length()
            int r0 = r11.length()
            if (r1 < r0) goto L_0x004e
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r5 = r12.replaceAll(r1, r0)
            java.lang.String r1 = r10.replaceAll(r1, r0)
            java.lang.String r6 = X.C107195ar.A02(r9, r11, r1)
            java.lang.String r4 = X.C107195ar.A02(r9, r11, r5)
            java.lang.String r7 = X.AnonymousClass000.A0T(r11, r6)
            int r0 = A00(r6, r4)
            if (r0 != 0) goto L_0x004f
            boolean r0 = r4.equals(r6)
            if (r0 != 0) goto L_0x004e
            boolean r0 = r4.equals(r7)
            if (r0 != 0) goto L_0x004e
            boolean r0 = X.C107195ar.A05(r5, r6, r4, r11)
            if (r0 != 0) goto L_0x004e
            boolean r0 = r1.endsWith(r4)
            if (r0 == 0) goto L_0x004f
            int r1 = X.C107195ar.A00(r9, r11, r4)
            r0 = 5
            if (r1 != r0) goto L_0x004f
        L_0x004e:
            return r8
        L_0x004f:
            r3 = 1
            r2 = 0
            if (r4 == 0) goto L_0x005a
            boolean r0 = r5.equals(r4)
            r1 = 1
            if (r0 == 0) goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            boolean r0 = A0Q(r9, r5, r11, r7, r3)
            if (r0 == 0) goto L_0x0062
            return r5
        L_0x0062:
            if (r1 == 0) goto L_0x006b
            boolean r0 = A0Q(r9, r4, r11, r7, r3)
            if (r0 == 0) goto L_0x006b
            return r4
        L_0x006b:
            boolean r0 = A0Q(r9, r5, r11, r6, r2)
            if (r0 == 0) goto L_0x007a
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r11, r5)
        L_0x0075:
            java.lang.String r0 = r0.toString()
            return r0
        L_0x007a:
            if (r1 == 0) goto L_0x004e
            boolean r0 = A0Q(r9, r4, r11, r6, r2)
            if (r0 == 0) goto L_0x004e
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r11, r4)
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36l.A0B(X.5Xx, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void A0D(Activity activity, C614930z r3, AnonymousClass33p r4, C54412og r5) {
        if (!TextUtils.isEmpty(C18280x3.A0Z(AnonymousClass0x2.A0F(r4), "account_switching_logged_out_phone_number"))) {
            A0F(activity, r4, r5, (Runnable) null, (String) null);
            return;
        }
        Log.i("AccountSwitcher/abandonAddAccount");
        r3.A04(activity, (String) null);
    }

    public static void A0E(Activity activity, AnonymousClass33p r4, C54412og r5) {
        if (!TextUtils.isEmpty(C18280x3.A0Z(AnonymousClass0x2.A0F(r4), "account_switching_logged_out_phone_number"))) {
            A0F(activity, r4, r5, (Runnable) null, (String) null);
            return;
        }
        A0G(activity, (Runnable) null, (String) null, r5.A02(), r4.A0C());
    }

    public static void A0G(Activity activity, Runnable runnable, String str, String str2, int i) {
        C19340zH A002 = AnonymousClass5V0.A00(activity);
        A002.A0i(false);
        A002.A0U(R.string.f11nameremoved);
        A002.A0T(R.string.f11nameremoved);
        A002.A0Y(new C1235268t(runnable, 94), R.string.f11nameremoved);
        A002.A0W(new C108005cG(activity, runnable, str, str2, i), R.string.f11nameremoved);
        A002.A0S();
    }

    public static void A0K(View view, C89654ea r3, C620733j r4, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        Toolbar toolbar = (Toolbar) C06560Yg.A02(view, i);
        toolbar.setVisibility(0);
        r3.setSupportActionBar(toolbar);
        AnonymousClass0R8 supportActionBar = r3.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(z);
            supportActionBar.A0Q(false);
        }
        if (z3) {
            C18260x0.A0E(r3, r3.getResources(), toolbar, r4, R.drawable.ic_close);
            toolbar.setNavigationOnClickListener(new C109385eX(r3, 30));
            i2 = R.string.f11nameremoved;
        } else if (z2) {
            C18260x0.A0E(r3, r3.getResources(), toolbar, r4, R.drawable.ic_back);
            toolbar.setNavigationOnClickListener(new C109385eX(r3, 31));
            i2 = R.string.f11nameremoved;
        } else {
            return;
        }
        toolbar.setNavigationContentDescription(i2);
    }

    public static boolean A0P(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return AnonymousClass001.A1V(((((float) displayMetrics.heightPixels) / displayMetrics.density) > 500.0f ? 1 : ((((float) displayMetrics.heightPixels) / displayMetrics.density) == 500.0f ? 0 : -1)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0Q(X.C106175Xx r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r7 = 0
            if (r0 != 0) goto L_0x0057
            int r1 = r9.length()
            int r4 = r10.length()
            if (r1 < r4) goto L_0x0057
            r3 = 1
            int r6 = r11.length()
            int r0 = r6 - r1
            int r0 = java.lang.Math.abs(r0)
            r5 = 0
            if (r0 != r3) goto L_0x005e
            r2 = r9
            if (r6 >= r1) goto L_0x0023
            r2 = r11
        L_0x0023:
            boolean r0 = r2.equals(r11)
            if (r0 == 0) goto L_0x002a
            r11 = r9
        L_0x002a:
            int r0 = r2.length()
            if (r5 >= r0) goto L_0x007e
            char r1 = r2.charAt(r5)
            char r0 = r11.charAt(r5)
            if (r1 == r0) goto L_0x005b
            int r0 = r5 + 1
            java.lang.String r1 = r11.substring(r0)
            java.lang.String r0 = r2.substring(r5)
        L_0x0044:
            boolean r0 = r1.equals(r0)
        L_0x0048:
            if (r12 == 0) goto L_0x0058
            if (r0 == 0) goto L_0x0057
            java.lang.String r9 = r9.substring(r4)
        L_0x0050:
            int r0 = X.C107195ar.A00(r8, r10, r9)
            if (r0 != r3) goto L_0x0057
            r7 = 1
        L_0x0057:
            return r7
        L_0x0058:
            if (r0 == 0) goto L_0x0057
            goto L_0x0050
        L_0x005b:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x005e:
            if (r0 != 0) goto L_0x0080
            r2 = 0
        L_0x0061:
            if (r2 >= r6) goto L_0x0080
            char r1 = r11.charAt(r2)
            char r0 = r9.charAt(r2)
            if (r1 == r0) goto L_0x007b
            int r6 = r6 - r3
            if (r2 == r6) goto L_0x007e
            int r0 = r2 + 1
            java.lang.String r1 = r11.substring(r0)
            java.lang.String r0 = r9.substring(r0)
            goto L_0x0044
        L_0x007b:
            int r2 = r2 + 1
            goto L_0x0061
        L_0x007e:
            r0 = 1
            goto L_0x0048
        L_0x0080:
            r0 = 0
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36l.A0Q(X.5Xx, java.lang.String, java.lang.String, java.lang.String, boolean):boolean");
    }

    public static boolean A0R(AnonymousClass33p r4, AnonymousClass1VX r5) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RegistrationUtils/isMAACPhase2Enabled/autoconfType=");
        A0o.append(r4.A01());
        A0o.append("/autoconf_phase_2_enabled = ");
        C58422vE r2 = C58422vE.A02;
        C18260x0.A1V(A0o, r5.A0Y(r2, 4667));
        if (r4.A01() < 2 || !r5.A0Y(r2, 4667)) {
            return false;
        }
        return true;
    }

    public static boolean A0S(AnonymousClass33p r7, boolean z) {
        int A01 = r7.A01();
        C183538qC r3 = r7.A01;
        int i = C18300x5.A0B(r3).getInt("autoconf_cf_type", -1);
        boolean A1U = AnonymousClass000.A1U(C18300x5.A0B(r3).getInt("pref_autoconf_verification_status", -1), 1);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RegistrationUtils/shouldCreateAutoconfVerifier/autoconfType=");
        A0o.append(A01);
        A0o.append("/autoconfCfType=");
        A0o.append(i);
        A0o.append("/isSimPresent=");
        A0o.append(z);
        A0o.append("/registeredWithAutoConf=");
        A0o.append(A1U);
        C18260x0.A1E("/bypassSimCheck=", A0o, false);
        if (A01 < 1 || A1U) {
            return false;
        }
        if (z || i == 1) {
            return true;
        }
        return false;
    }

    public static byte[] A0T(String str) {
        try {
            UUID fromString = UUID.fromString(str);
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putLong(fromString.getMostSignificantBits());
            allocate.putLong(fromString.getLeastSignificantBits());
            return allocate.array();
        } catch (IllegalArgumentException unused) {
            C18260x0.A0r("RegistrationUtils/getBytesFromUUIDString/invalid-input ", str, AnonymousClass001.A0o());
            return new byte[0];
        }
    }
}
