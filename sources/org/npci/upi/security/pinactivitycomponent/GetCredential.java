package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass002;
import X.AnonymousClass4MB;
import X.AnonymousClass6C8;
import X.AnonymousClass6CH;
import X.AnonymousClass7Q1;
import X.C009707r;
import X.C08310eF;
import X.C124396Cc;
import X.C1454175p;
import X.C147587Ew;
import X.C151317Ug;
import X.C153547bW;
import X.C71303bt;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;
import com.whatsapp.R;
import java.lang.Thread;
import java.util.Locale;

public class GetCredential extends C009707r {
    public static GetCredential A0L;
    public int A00;
    public int A01 = 0;
    public Bitmap A02;
    public TransitionDrawable A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public ImageView A07;
    public C08310eF A08;
    public Boolean A09;
    public Boolean A0A;
    public String A0B;
    public String A0C;
    public Thread.UncaughtExceptionHandler A0D = null;
    public C124396Cc A0E;
    public AnonymousClass4MB A0F;
    public C151317Ug A0G;
    public C153547bW A0H;
    public s A0I = null;
    public boolean A0J = false;
    public final Context A0K = this;

    public static void A0C(View view, float f, float f2) {
        RotateAnimation rotateAnimation = new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration((long) 300);
        rotateAnimation.setFillEnabled(true);
        rotateAnimation.setFillAfter(true);
        view.startAnimation(rotateAnimation);
    }

    public static /* synthetic */ void A0L(GetCredential getCredential, boolean z) {
        float f = 0.0f;
        ImageView imageView = getCredential.A07;
        if (z) {
            A0C(imageView, 0.0f, 180.0f);
        } else {
            A0C(imageView, 180.0f, 0.0f);
        }
        int height = getCredential.A04.getHeight();
        if (height == 0) {
            height = getCredential.A00;
        }
        getCredential.A04.clearAnimation();
        ViewPropertyAnimator animate = getCredential.A04.animate();
        float f2 = 0.0f;
        if (!z) {
            f2 = ((float) height) * -1.0f;
        }
        ViewPropertyAnimator y = animate.y(f2);
        if (z) {
            f = 1.0f;
        }
        y.alpha(f).setDuration(300).setInterpolator(new AccelerateInterpolator()).setListener(new AnonymousClass6CH(getCredential, height, z));
    }

    public void attachBaseContext(Context context) {
        String string = new C147587Ew(context).A00.getString("org.npci.upi.language.pref", "en_US");
        if (Build.VERSION.SDK_INT >= 24) {
            context = C1454175p.A00(context, string);
        } else {
            Locale A0k = AnonymousClass6C8.A0k(string);
            Locale.setDefault(A0k);
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.locale = A0k;
            configuration.setLayoutDirection(A0k);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        super.attachBaseContext(context);
    }

    public void onBackPressed() {
        if (this.A0J) {
            Bundle A082 = AnonymousClass002.A08();
            A082.putString("error", "USER_ABORTED");
            AnonymousClass7Q1.A0B.send(0, A082);
            super.onBackPressed();
            return;
        }
        this.A0J = true;
        Toast.makeText(this, getString(R.string.f11nameremoved), 0).show();
        new Handler().postDelayed(new C71303bt(this, 11), 2000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        r3 = new X.C143876zc(r14, "L15", "l15.message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03c6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r3 = new X.C143876zc(r14, "L09", "l09.message", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0416, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        r3 = new X.C143876zc(r14, "L13", "l13.message", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0421, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0422, code lost:
        r3 = new X.C143876zc(r14, "L11", "l11.message", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x042c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x042d, code lost:
        r3 = new X.C143876zc(r14, "L10", "l10.message", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0462, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        r3 = new X.C143876zc(r14, "L07", "l07.message", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0469, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x046a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x046b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x046c, code lost:
        r3 = new X.C143876zc(r14, "L07", "l07.message", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0472, code lost:
        r3 = new X.C143876zc(r14, "L14", "l14.message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0aae, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:?, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append(r4.a);
        r3 = X.AnonymousClass000.A0X("", r1);
        r1 = r4.b;
        r2 = X.AnonymousClass002.A08();
        r2.putString("errorCode", r3);
        r2.putString("error", r1);
        X.AnonymousClass7Q1.A0B.send(0, r2);
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0ad7, code lost:
        throw r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x036a */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0469 A[Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c, 6zc | Exception -> 0x047c, 6zb -> 0x0aae }, ExcHandler: 6zc (r0v290 'e' X.6zc A[CUSTOM_DECLARE, Catch:{ Exception -> 0x0aeb }]), Splitter:B:8:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:230:? A[ExcHandler: 6zc | Exception (unused java.lang.Throwable), SYNTHETIC, Splitter:B:3:0x0034] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r14 = r21
            android.view.Window r1 = r14.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
            r0 = r22
            super.onCreate(r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r0 = r1.getUncaughtExceptionHandler()
            r14.A0D = r0
            X.8Mr r0 = new X.8Mr
            r0.<init>()
            r1.setUncaughtExceptionHandler(r0)
            android.os.Bundle r0 = X.C86614Ku.A0D(r14)
            X.7Ug r3 = new X.7Ug
            r3.<init>(r0)
            r14.A0G = r3
            X.7Q1 r1 = new X.7Q1     // Catch:{ Exception -> 0x0aeb }
            r1.<init>()     // Catch:{ Exception -> 0x0aeb }
            r3.A0H = r1     // Catch:{ Exception -> 0x0aeb }
            X.7XH r0 = new X.7XH     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r0.<init>(r14, r1)     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r3.A0G = r0     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            X.7Q1 r2 = r3.A0H     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            android.os.Bundle r5 = r3.A01     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            java.lang.String r18 = "l09.message"
            java.lang.String r4 = "L09"
            java.lang.String r7 = "l07.message"
            java.lang.String r6 = "L07"
            java.lang.String r8 = "txnId"
            java.lang.String r0 = "credType"
            X.2fW r1 = new X.2fW     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r1.<init>(r14)     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r2.A0A = r1     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            org.json.JSONArray r3 = X.AnonymousClass0x9.A1F()     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            r2.A06 = r3     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            java.lang.String r1 = "setMpin"
            r3.put(r1)     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            org.json.JSONArray r1 = r2.A06     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            java.lang.String r11 = "pay"
            r1.put(r11)     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            org.json.JSONArray r1 = r2.A06     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            java.lang.String r10 = "collect"
            r1.put(r10)     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            org.json.JSONArray r1 = r2.A06     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            java.lang.String r12 = "reqBalChk"
            r1.put(r12)     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            org.json.JSONArray r3 = r2.A06     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            java.lang.String r1 = "reqBalEnq"
            r3.put(r1)     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            org.json.JSONArray r3 = r2.A06     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            java.lang.String r1 = "changeMpin"
            r3.put(r1)     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            org.json.JSONArray r3 = r2.A06     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            java.lang.String r1 = "mandate"
            r3.put(r1)     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            org.json.JSONArray r3 = r2.A06     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            java.lang.String r1 = "binding"
            r3.put(r1)     // Catch:{ Exception -> 0x046b, 6zc | Exception -> 0x047c }
            java.lang.String r1 = "keyCode"
            java.lang.String r1 = r5.getString(r1)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0462, 6zc | Exception -> 0x047c }
            r2.A01 = r1     // Catch:{ 6zc -> 0x0469, Exception -> 0x0462, 6zc | Exception -> 0x047c }
            if (r1 == 0) goto L_0x0458
            boolean r1 = r1.isEmpty()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0462, 6zc | Exception -> 0x047c }
            if (r1 != 0) goto L_0x0458
            java.lang.String r1 = "keyXmlPayload"
            java.lang.String r3 = r5.getString(r1)     // Catch:{ 6zb -> 0x044a, 6zc -> 0x0469, Exception -> 0x0441, 6zc | Exception -> 0x047c }
            if (r3 == 0) goto L_0x0437
            boolean r1 = r3.isEmpty()     // Catch:{ 6zb -> 0x044a, 6zc -> 0x0469, Exception -> 0x0441, 6zc | Exception -> 0x047c }
            if (r1 != 0) goto L_0x0437
            X.7Wj r1 = new X.7Wj     // Catch:{ 6zb -> 0x044a, 6zc -> 0x0469, Exception -> 0x0441, 6zc | Exception -> 0x047c }
            r1.<init>(r3)     // Catch:{ 6zb -> 0x044a, 6zc -> 0x0469, Exception -> 0x0441, 6zc | Exception -> 0x047c }
            r2.A00 = r1     // Catch:{ 6zb -> 0x044a, 6zc -> 0x0469, Exception -> 0x0441, 6zc | Exception -> 0x047c }
            java.lang.String r1 = "controls"
            java.lang.String r3 = r5.getString(r1)     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            if (r3 == 0) goto L_0x00e2
            boolean r1 = r3.isEmpty()     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            if (r1 != 0) goto L_0x00e2
            java.lang.String r1 = "AADHAAR"
            boolean r1 = r3.contains(r1)     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            if (r1 == 0) goto L_0x00db
            java.lang.String r1 = "ATMPIN"
            boolean r1 = r3.contains(r1)     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            if (r1 == 0) goto L_0x00db
            java.lang.String r2 = "L32"
            java.lang.String r1 = "l32.message"
            X.6zc r0 = new X.6zc     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            r0.<init>(r14, r2, r1)     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            throw r0     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
        L_0x00db:
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r3)     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            r2.A07 = r1     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            goto L_0x0113
        L_0x00e2:
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1G()     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            java.lang.String r3 = "type"
            java.lang.String r1 = "PIN"
            r7.put(r3, r1)     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            java.lang.String r3 = "subtype"
            java.lang.String r1 = "MPIN"
            r7.put(r3, r1)     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            java.lang.String r3 = "dType"
            java.lang.String r1 = "NUM|ALPH"
            r7.put(r3, r1)     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            java.lang.String r3 = "dLength"
            r1 = 6
            r7.put(r3, r1)     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            org.json.JSONArray r6 = X.AnonymousClass0x9.A1F()     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            r6.put(r7)     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            org.json.JSONObject r3 = X.AnonymousClass0x9.A1G()     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            r2.A07 = r3     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
            java.lang.String r1 = "CredAllowed"
            r3.put(r1, r6)     // Catch:{ 6zc -> 0x0469, Exception -> 0x042c, 6zc | Exception -> 0x047c }
        L_0x0113:
            java.lang.String r1 = "configuration"
            java.lang.String r3 = r5.getString(r1)     // Catch:{ Exception -> 0x0421, 6zc | Exception -> 0x047c }
            if (r3 == 0) goto L_0x0127
            boolean r1 = r3.isEmpty()     // Catch:{ Exception -> 0x0421, 6zc | Exception -> 0x047c }
            if (r1 != 0) goto L_0x0127
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r3)     // Catch:{ Exception -> 0x0421, 6zc | Exception -> 0x047c }
            r2.A08 = r1     // Catch:{ Exception -> 0x0421, 6zc | Exception -> 0x047c }
        L_0x0127:
            java.lang.String r1 = "salt"
            java.lang.String r16 = r5.getString(r1)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1H(r16)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r16 == 0) goto L_0x0402
            boolean r1 = r16.isEmpty()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r1 != 0) goto L_0x0402
            boolean r1 = r7.has(r0)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            java.lang.String r13 = "l24.message"
            java.lang.String r9 = "L24"
            if (r1 == 0) goto L_0x03fc
            java.lang.Object r1 = r7.get(r0)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            boolean r3 = r1 instanceof org.json.JSONArray     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            java.lang.String r6 = "l27.message"
            java.lang.String r1 = "L27"
            if (r3 == 0) goto L_0x03f6
            org.json.JSONArray r0 = r7.getJSONArray(r0)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.A05 = r0     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            int r0 = r0.length()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r3 = 1
            if (r0 < r3) goto L_0x03f0
            org.json.JSONArray r0 = r2.A05     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            int r15 = r0.length()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r0 = 2
            if (r15 > r0) goto L_0x03ea
            java.lang.Boolean r15 = java.lang.Boolean.TRUE     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r13 = 0
        L_0x0168:
            org.json.JSONArray r0 = r2.A05     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            int r0 = r0.length()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r13 >= r0) goto L_0x0195
            r9 = 0
        L_0x0171:
            org.json.JSONArray r0 = r2.A06     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            int r0 = r0.length()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r9 >= r0) goto L_0x0192
            org.json.JSONArray r0 = r2.A05     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            java.lang.String r15 = r0.getString(r13)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            org.json.JSONArray r0 = r2.A06     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            java.lang.String r0 = r0.getString(r9)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            boolean r0 = r15.equals(r0)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r0 != 0) goto L_0x0190
            java.lang.Boolean r15 = java.lang.Boolean.FALSE     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            int r9 = r9 + 1
            goto L_0x0171
        L_0x0190:
            java.lang.Boolean r15 = java.lang.Boolean.TRUE     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
        L_0x0192:
            int r13 = r13 + 1
            goto L_0x0168
        L_0x0195:
            boolean r0 = r15.booleanValue()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r0 == 0) goto L_0x040c
            java.lang.Boolean r13 = java.lang.Boolean.FALSE     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r9 = 0
        L_0x019e:
            org.json.JSONArray r0 = r2.A05     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            int r0 = r0.length()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r9 >= r0) goto L_0x01b7
            org.json.JSONArray r0 = r2.A05     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            java.lang.String r0 = r0.getString(r9)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            boolean r0 = r0.equals(r12)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r0 == 0) goto L_0x01b4
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
        L_0x01b4:
            int r9 = r9 + 1
            goto L_0x019e
        L_0x01b7:
            boolean r0 = r13.booleanValue()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r0 == 0) goto L_0x01f6
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r9 = 0
        L_0x01c0:
            org.json.JSONArray r0 = r2.A05     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            int r0 = r0.length()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r9 >= r0) goto L_0x01e5
            org.json.JSONArray r0 = r2.A05     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            java.lang.String r0 = r0.getString(r9)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            boolean r0 = r0.equals(r11)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r0 != 0) goto L_0x01e0
            org.json.JSONArray r0 = r2.A05     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            java.lang.String r0 = r0.getString(r9)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            boolean r0 = r0.equals(r10)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r0 == 0) goto L_0x01e2
        L_0x01e0:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
        L_0x01e2:
            int r9 = r9 + 1
            goto L_0x01c0
        L_0x01e5:
            boolean r0 = r12.booleanValue()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r0 != 0) goto L_0x01f6
            java.lang.String r1 = "L25"
            java.lang.String r0 = "l25.message"
            X.6zc r2 = new X.6zc     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.<init>(r14, r1, r0)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            goto L_0x0415
        L_0x01f6:
            boolean r0 = r7.has(r8)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r0 == 0) goto L_0x03e0
            java.lang.Object r0 = r7.get(r8)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            boolean r0 = r0 instanceof org.json.JSONArray     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r0 == 0) goto L_0x03da
            org.json.JSONArray r0 = r7.getJSONArray(r8)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.A04 = r0     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            int r1 = r0.length()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            org.json.JSONArray r0 = r2.A05     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            int r0 = r0.length()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r1 != r0) goto L_0x03d0
            org.json.JSONArray r0 = r2.A04     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            int r0 = r0.length()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r0 <= r3) goto L_0x0245
            org.json.JSONArray r0 = r2.A04     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            int r1 = r0.length()     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r0 = 2
            if (r1 > r0) goto L_0x0245
            org.json.JSONArray r1 = r2.A04     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r0 = 0
            java.lang.String r1 = r1.getString(r0)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            org.json.JSONArray r0 = r2.A04     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            java.lang.String r0 = r0.getString(r3)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            boolean r0 = r1.equals(r0)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            if (r0 == 0) goto L_0x0245
            java.lang.String r1 = "L29"
            java.lang.String r0 = "l29.message"
            X.6zc r2 = new X.6zc     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.<init>(r14, r1, r0)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            goto L_0x0415
        L_0x0245:
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r16)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.A09 = r0     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            java.lang.String r0 = "trust"
            java.lang.String r1 = r5.getString(r0)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            if (r1 == 0) goto L_0x03b4
            boolean r0 = r1.isEmpty()     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            if (r0 != 0) goto L_0x03b4
            org.json.JSONObject r17 = X.AnonymousClass0x9.A1H(r1)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            r7 = 0
        L_0x025e:
            org.json.JSONArray r0 = r2.A05     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            int r0 = r0.length()     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            if (r7 >= r0) goto L_0x037a
            org.json.JSONArray r0 = r2.A05     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            java.lang.String r13 = r0.getString(r7)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            org.json.JSONArray r0 = r2.A04     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            java.lang.String r12 = r0.getString(r7)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            org.json.JSONArray r0 = r2.A05     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            java.lang.String r1 = r0.getString(r7)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            r0 = r17
            java.lang.String r16 = r0.getString(r1)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            java.lang.String r0 = "txnAmount"
            java.lang.String r15 = r1.optString(r0)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            java.lang.String r0 = "appId"
            java.lang.String r11 = r1.optString(r0)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            java.lang.String r0 = "deviceId"
            java.lang.String r10 = r1.optString(r0)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            java.lang.String r0 = "mobileNumber"
            java.lang.String r9 = r1.optString(r0)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            java.lang.String r0 = "payerAddr"
            java.lang.String r6 = r1.optString(r0)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            org.json.JSONObject r1 = r2.A09     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            java.lang.String r0 = "payeeAddr"
            java.lang.String r1 = r1.optString(r0)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            org.json.JSONObject r3 = r2.A09     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            java.lang.String r0 = "random"
            java.lang.String r3 = r3.optString(r0)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            r0 = 150(0x96, float:2.1E-43)
            java.lang.StringBuilder r8 = X.AnonymousClass6CA.A0Y(r0)     // Catch:{ Exception -> 0x03be }
            java.lang.String r0 = "|"
            if (r13 == 0) goto L_0x02c3
            X.AnonymousClass6C7.A1M(r8, r13)     // Catch:{ Exception -> 0x03be }
        L_0x02c3:
            if (r12 == 0) goto L_0x02c8
            X.AnonymousClass6C7.A1M(r8, r12)     // Catch:{ Exception -> 0x03be }
        L_0x02c8:
            if (r11 == 0) goto L_0x02cd
            X.AnonymousClass6C7.A1M(r8, r11)     // Catch:{ Exception -> 0x03be }
        L_0x02cd:
            if (r9 == 0) goto L_0x02d2
            X.AnonymousClass6C7.A1M(r8, r9)     // Catch:{ Exception -> 0x03be }
        L_0x02d2:
            if (r10 == 0) goto L_0x02d7
            X.AnonymousClass6C7.A1M(r8, r10)     // Catch:{ Exception -> 0x03be }
        L_0x02d7:
            if (r6 == 0) goto L_0x02dc
            X.AnonymousClass6C7.A1M(r8, r6)     // Catch:{ Exception -> 0x03be }
        L_0x02dc:
            if (r1 == 0) goto L_0x02e1
            X.AnonymousClass6C7.A1M(r8, r1)     // Catch:{ Exception -> 0x03be }
        L_0x02e1:
            if (r15 == 0) goto L_0x02e6
            X.AnonymousClass6C7.A1M(r8, r15)     // Catch:{ Exception -> 0x03be }
        L_0x02e6:
            int r1 = r8.lastIndexOf(r0)     // Catch:{ Exception -> 0x03be }
            r0 = -1
            if (r1 == r0) goto L_0x02f8
            int r0 = r8.length()     // Catch:{ Exception -> 0x03be }
            int r0 = r0 + -1
            if (r1 != r0) goto L_0x02f8
            r8.deleteCharAt(r1)     // Catch:{ Exception -> 0x03be }
        L_0x02f8:
            X.2fW r0 = r2.A0A     // Catch:{ Exception -> 0x03be }
            java.util.List r0 = r0.A00()     // Catch:{ Exception -> 0x03be }
            java.lang.Object r0 = X.C18290x4.A0k(r0)     // Catch:{ Exception -> 0x03be }
            X.7gy r0 = (X.C156647gy) r0     // Catch:{ Exception -> 0x03be }
            java.lang.String r6 = r0.A01     // Catch:{ Exception -> 0x03be }
            java.lang.String r1 = r8.toString()     // Catch:{ Exception -> 0x03be }
            X.7pJ r0 = new X.7pJ     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            r0.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            r10 = 2
            byte[] r0 = r3.getBytes()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            byte[] r11 = X.C154487dF.A01(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            byte[] r0 = X.C161257pJ.A00(r1, r3)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            java.lang.String r9 = X.C154487dF.A00(r0, r10)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            byte[] r0 = r16.getBytes()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            byte[] r8 = X.C154487dF.A01(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            int r0 = r6.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            int r3 = r0 / 2
            byte[] r1 = new byte[r3]     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            r0 = 0
        L_0x0331:
            if (r0 >= r3) goto L_0x0339
            X.AnonymousClass6C9.A16(r6, r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            int r0 = r0 + 1
            goto L_0x0331
        L_0x0339:
            java.lang.String r0 = "AES"
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            r6.<init>(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            r1 = 128(0x80, float:1.794E-43)
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            r0.<init>(r1, r11)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            r3.init(r10, r6, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            byte[] r0 = r3.doFinal(r8)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            java.lang.String r0 = X.C154487dF.A00(r0, r10)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            boolean r0 = r0.equalsIgnoreCase(r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            if (r0 == 0) goto L_0x0362
            int r7 = r7 + 1
            goto L_0x025e
        L_0x0362:
            X.6ul r1 = X.C140936ul.A05     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            X.6zb r0 = new X.6zb     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
            throw r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0372, Exception -> 0x036a }
        L_0x036a:
            X.6ul r0 = X.C140936ul.A04     // Catch:{ Exception -> 0x03be }
            X.6zb r1 = new X.6zb     // Catch:{ Exception -> 0x03be }
            r1.<init>(r0)     // Catch:{ Exception -> 0x03be }
            goto L_0x0379
        L_0x0372:
            X.6ul r0 = X.C140936ul.A04     // Catch:{ Exception -> 0x03be }
            X.6zb r1 = new X.6zb     // Catch:{ Exception -> 0x03be }
            r1.<init>(r0)     // Catch:{ Exception -> 0x03be }
        L_0x0379:
            throw r1     // Catch:{ Exception -> 0x03be }
        L_0x037a:
            java.lang.String r0 = "payInfo"
            java.lang.String r1 = r5.getString(r0)     // Catch:{ Exception -> 0x0472, 6zc | Exception -> 0x047c }
            if (r1 == 0) goto L_0x038f
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0472, 6zc | Exception -> 0x047c }
            if (r0 != 0) goto L_0x038f
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x0472, 6zc | Exception -> 0x047c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0472, 6zc | Exception -> 0x047c }
            r2.A03 = r0     // Catch:{ Exception -> 0x0472, 6zc | Exception -> 0x047c }
        L_0x038f:
            java.lang.String r0 = "languagePref"
            java.lang.String r1 = r5.getString(r0)     // Catch:{ Exception -> 0x03a9, 6zc | Exception -> 0x047c }
            if (r1 == 0) goto L_0x03a6
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x03a9, 6zc | Exception -> 0x047c }
            if (r0 != 0) goto L_0x03a6
        L_0x039d:
            java.util.Locale r0 = new java.util.Locale     // Catch:{ Exception -> 0x03a9, 6zc | Exception -> 0x047c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x03a9, 6zc | Exception -> 0x047c }
            r2.A02 = r0     // Catch:{ Exception -> 0x03a9, 6zc | Exception -> 0x047c }
            goto L_0x047c
        L_0x03a6:
            java.lang.String r1 = "en_US"
            goto L_0x039d
        L_0x03a9:
            java.lang.String r1 = "L15"
            java.lang.String r0 = "l15.message"
            X.6zc r3 = new X.6zc     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r3.<init>(r14, r1, r0)     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            goto L_0x047b
        L_0x03b4:
            java.lang.String r1 = "L17"
            java.lang.String r0 = "l17.message"
            X.6zc r2 = new X.6zc     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            r2.<init>(r14, r1, r0)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            goto L_0x03c5
        L_0x03be:
            X.6ul r0 = X.C140936ul.A05     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            X.6zb r2 = new X.6zb     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
            r2.<init>(r0)     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
        L_0x03c5:
            throw r2     // Catch:{ 6zc -> 0x0469, 6zc -> 0x0469, Exception -> 0x03c6, 6zc | Exception -> 0x047c }
        L_0x03c6:
            r1 = move-exception
            X.6zc r3 = new X.6zc     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r0 = r18
            r3.<init>(r14, r4, r0, r1)     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            goto L_0x047b
        L_0x03d0:
            java.lang.String r1 = "L28"
            java.lang.String r0 = "l28.message"
            X.6zc r2 = new X.6zc     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.<init>(r14, r1, r0)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            goto L_0x0415
        L_0x03da:
            X.6zc r2 = new X.6zc     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.<init>(r14, r1, r6)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            goto L_0x0415
        L_0x03e0:
            java.lang.String r1 = "L31"
            java.lang.String r0 = "l31.message"
            X.6zc r2 = new X.6zc     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.<init>(r14, r1, r0)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            goto L_0x0415
        L_0x03ea:
            X.6zc r2 = new X.6zc     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.<init>(r14, r9, r13)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            goto L_0x0415
        L_0x03f0:
            X.6zc r2 = new X.6zc     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.<init>(r14, r9, r13)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            goto L_0x0415
        L_0x03f6:
            X.6zc r2 = new X.6zc     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.<init>(r14, r1, r6)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            goto L_0x0415
        L_0x03fc:
            X.6zc r2 = new X.6zc     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.<init>(r14, r9, r13)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            goto L_0x0415
        L_0x0402:
            java.lang.String r1 = "L12"
            java.lang.String r0 = "l12.message"
            X.6zc r2 = new X.6zc     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.<init>(r14, r1, r0)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            goto L_0x0415
        L_0x040c:
            java.lang.String r1 = "L30"
            java.lang.String r0 = "l30.message"
            X.6zc r2 = new X.6zc     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
            r2.<init>(r14, r1, r0)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
        L_0x0415:
            throw r2     // Catch:{ 6zc -> 0x0469, Exception -> 0x0416, 6zc | Exception -> 0x047c }
        L_0x0416:
            r2 = move-exception
            java.lang.String r1 = "L13"
            java.lang.String r0 = "l13.message"
            X.6zc r3 = new X.6zc     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r3.<init>(r14, r1, r0, r2)     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            goto L_0x047b
        L_0x0421:
            r2 = move-exception
            java.lang.String r1 = "L11"
            java.lang.String r0 = "l11.message"
            X.6zc r3 = new X.6zc     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r3.<init>(r14, r1, r0, r2)     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            goto L_0x047b
        L_0x042c:
            r2 = move-exception
            java.lang.String r1 = "L10"
            java.lang.String r0 = "l10.message"
            X.6zc r3 = new X.6zc     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r3.<init>(r14, r1, r0, r2)     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            goto L_0x047b
        L_0x0437:
            java.lang.String r2 = "L08"
            java.lang.String r1 = "l08.message"
            X.6zc r0 = new X.6zc     // Catch:{ 6zb -> 0x044a, 6zc -> 0x0469, Exception -> 0x0441, 6zc | Exception -> 0x047c }
            r0.<init>(r14, r2, r1)     // Catch:{ 6zb -> 0x044a, 6zc -> 0x0469, Exception -> 0x0441, 6zc | Exception -> 0x047c }
            throw r0     // Catch:{ 6zb -> 0x044a, 6zc -> 0x0469, Exception -> 0x0441, 6zc | Exception -> 0x047c }
        L_0x0441:
            r1 = move-exception
            X.6zc r3 = new X.6zc     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r0 = r18
            r3.<init>(r14, r4, r0, r1)     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            goto L_0x047b
        L_0x044a:
            r2 = move-exception
            r2.getMessage()     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            java.lang.String r1 = "L05"
            java.lang.String r0 = "l05.message"
            X.6zc r3 = new X.6zc     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r3.<init>(r14, r1, r0, r2)     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            goto L_0x047b
        L_0x0458:
            java.lang.String r2 = "L06"
            java.lang.String r1 = "l06.message"
            X.6zc r0 = new X.6zc     // Catch:{ 6zc -> 0x0469, Exception -> 0x0462, 6zc | Exception -> 0x047c }
            r0.<init>(r14, r2, r1)     // Catch:{ 6zc -> 0x0469, Exception -> 0x0462, 6zc | Exception -> 0x047c }
            throw r0     // Catch:{ 6zc -> 0x0469, Exception -> 0x0462, 6zc | Exception -> 0x047c }
        L_0x0462:
            r0 = move-exception
            X.6zc r3 = new X.6zc     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r3.<init>(r14, r6, r7, r0)     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            goto L_0x047b
        L_0x0469:
            r0 = move-exception
            throw r0     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
        L_0x046b:
            r0 = move-exception
            X.6zc r3 = new X.6zc     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r3.<init>(r14, r6, r7, r0)     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            goto L_0x047b
        L_0x0472:
            java.lang.String r1 = "L14"
            java.lang.String r0 = "l14.message"
            X.6zc r3 = new X.6zc     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
            r3.<init>(r14, r1, r0)     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
        L_0x047b:
            throw r3     // Catch:{ 6zc | Exception -> 0x047c, 6zb -> 0x0aae }
        L_0x047c:
            java.lang.String r3 = "verifiedMerchant"
            java.lang.String r2 = "bankImage"
            java.lang.String r1 = "bankImageUrl"
            X.7Ug r0 = r14.A0G     // Catch:{ Exception -> 0x04f5 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x04f5 }
            boolean r0 = r0.has(r1)     // Catch:{ Exception -> 0x04f5 }
            if (r0 == 0) goto L_0x049a
            X.7Ug r0 = r14.A0G     // Catch:{ Exception -> 0x04f5 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x04f5 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x04f5 }
            r14.A0C = r0     // Catch:{ Exception -> 0x04f5 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x04f5 }
            r14.A09 = r0     // Catch:{ Exception -> 0x04f5 }
        L_0x049a:
            X.7Ug r0 = r14.A0G     // Catch:{ Exception -> 0x04f5 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x04f5 }
            boolean r0 = r0.has(r2)     // Catch:{ Exception -> 0x04f5 }
            if (r0 == 0) goto L_0x04b8
            X.7Ug r0 = r14.A0G     // Catch:{ Exception -> 0x04f5 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x04f5 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ Exception -> 0x04f5 }
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch:{ Exception -> 0x04f5 }
            int r0 = r1.length     // Catch:{ Exception -> 0x04f5 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r0)     // Catch:{ Exception -> 0x04f5 }
            r14.A02 = r0     // Catch:{ Exception -> 0x04f5 }
        L_0x04b8:
            X.7Ug r0 = r14.A0G     // Catch:{ Exception -> 0x04f5 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x04f5 }
            boolean r0 = r0.has(r3)     // Catch:{ Exception -> 0x04f5 }
            if (r0 == 0) goto L_0x04d0
            X.7Ug r0 = r14.A0G     // Catch:{ Exception -> 0x04f5 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x04f5 }
            boolean r0 = r0.getBoolean(r3)     // Catch:{ Exception -> 0x04f5 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x04f5 }
            r14.A0A = r0     // Catch:{ Exception -> 0x04f5 }
        L_0x04d0:
            X.7Ug r0 = r14.A0G     // Catch:{ Exception -> 0x04f5 }
            java.lang.String r0 = r0.A04     // Catch:{ Exception -> 0x04f5 }
            java.util.Locale r0 = X.AnonymousClass6C8.A0k(r0)     // Catch:{ Exception -> 0x04f5 }
            java.util.Locale.setDefault(r0)     // Catch:{ Exception -> 0x04f5 }
            android.content.res.Configuration r2 = new android.content.res.Configuration     // Catch:{ Exception -> 0x04f5 }
            r2.<init>()     // Catch:{ Exception -> 0x04f5 }
            r2.locale = r0     // Catch:{ Exception -> 0x04f5 }
            android.content.Context r0 = r14.getBaseContext()     // Catch:{ Exception -> 0x04f5 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ Exception -> 0x04f5 }
            android.content.Context r0 = r14.getBaseContext()     // Catch:{ Exception -> 0x04f5 }
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r0)     // Catch:{ Exception -> 0x04f5 }
            r1.updateConfiguration(r2, r0)     // Catch:{ Exception -> 0x04f5 }
        L_0x04f5:
            X.7Ug r0 = r14.A0G
            org.json.JSONArray r0 = r0.A08
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "SIGNATURE"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0562
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            android.content.Context r5 = r14.A0K     // Catch:{ Exception -> 0x0534 }
            X.7Ug r0 = r14.A0G     // Catch:{ Exception -> 0x0534 }
            org.json.JSONObject r4 = r0.A0E     // Catch:{ Exception -> 0x0534 }
            org.json.JSONArray r3 = r0.A08     // Catch:{ Exception -> 0x0534 }
            org.json.JSONObject r0 = r0.A0C     // Catch:{ Exception -> 0x0534 }
            X.7bW r1 = new X.7bW     // Catch:{ Exception -> 0x0534 }
            r1.<init>(r5, r3, r4, r0)     // Catch:{ Exception -> 0x0534 }
            r14.A0H = r1     // Catch:{ Exception -> 0x0534 }
            X.7Ug r0 = r14.A0G     // Catch:{ Exception -> 0x0534 }
            java.lang.Boolean r0 = r0.A02     // Catch:{ Exception -> 0x0534 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0534 }
            if (r0 == 0) goto L_0x052d
            java.lang.Integer r0 = X.C1461178s.A01     // Catch:{ Exception -> 0x0534 }
            boolean r0 = r1.A07(r0)     // Catch:{ Exception -> 0x0534 }
        L_0x0528:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0534 }
            goto L_0x0542
        L_0x052d:
            java.lang.Integer r0 = X.C1461178s.A00     // Catch:{ Exception -> 0x0534 }
            boolean r0 = r1.A07(r0)     // Catch:{ Exception -> 0x0534 }
            goto L_0x0528
        L_0x0534:
            r1 = move-exception
            boolean r0 = r1 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L_0x0549
            android.content.Context r1 = r14.A0K
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            java.lang.String r0 = "SYNC_REQUIRED"
        L_0x053f:
            r1.A5p(r0)
        L_0x0542:
            boolean r0 = r6.booleanValue()
            if (r0 != 0) goto L_0x0562
            return
        L_0x0549:
            boolean r0 = r1 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto L_0x0554
            android.content.Context r1 = r14.A0K
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            java.lang.String r0 = "INVALID_REQUEST"
            goto L_0x053f
        L_0x0554:
            boolean r0 = r1 instanceof java.security.cert.CertificateException
            android.content.Context r1 = r14.A0K
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            if (r0 == 0) goto L_0x055f
            java.lang.String r0 = "LITE_KEYS_ROTATION_NEEDED"
            goto L_0x053f
        L_0x055f:
            java.lang.String r0 = "TECHNICAL_ERROR"
            goto L_0x053f
        L_0x0562:
            X.7Ug r1 = r14.A0G
            boolean r0 = r1.A0L
            if (r0 == 0) goto L_0x0684
            java.lang.String r5 = "."
            org.json.JSONArray r0 = r1.A08     // Catch:{ Exception -> 0x067a }
            r4 = 0
            org.json.JSONObject r1 = r0.getJSONObject(r4)     // Catch:{ Exception -> 0x067a }
            java.lang.String r0 = "subtype"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ Exception -> 0x067a }
            X.7Ug r0 = r14.A0G     // Catch:{ Exception -> 0x067a }
            org.json.JSONObject r7 = r0.A0C     // Catch:{ Exception -> 0x067a }
            java.lang.String r0 = "IDENTITY"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x067a }
            if (r0 == 0) goto L_0x066e
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x067a }
            if (r7 == 0) goto L_0x0597
            java.lang.String r1 = "enableUserAuth"
            java.lang.String r0 = "true"
            java.lang.String r0 = r7.optString(r1, r0)     // Catch:{ Exception -> 0x067a }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x067a }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x067a }
        L_0x0597:
            boolean r0 = r2.booleanValue()     // Catch:{ Exception -> 0x067a }
            if (r0 == 0) goto L_0x05ba
            android.content.Context r1 = r14.A0K     // Catch:{ Exception -> 0x067a }
            java.lang.String r0 = "keyguard"
            java.lang.Object r3 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x067a }
            android.app.KeyguardManager r3 = (android.app.KeyguardManager) r3     // Catch:{ Exception -> 0x067a }
            boolean r0 = r3.isKeyguardSecure()     // Catch:{ Exception -> 0x067a }
            if (r0 != 0) goto L_0x05b7
            java.lang.Class<org.npci.upi.security.pinactivitycomponent.UserAuthInfoActivity> r1 = org.npci.upi.security.pinactivitycomponent.UserAuthInfoActivity.class
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x067a }
            r0.<init>(r14, r1)     // Catch:{ Exception -> 0x067a }
            r14.startActivity(r0)     // Catch:{ Exception -> 0x067a }
        L_0x05b7:
            r3.isKeyguardSecure()     // Catch:{ Exception -> 0x067a }
        L_0x05ba:
            android.content.Context r3 = r14.A0K     // Catch:{ Exception -> 0x067a }
            X.7Ug r0 = r14.A0G     // Catch:{ Exception -> 0x067a }
            org.json.JSONObject r1 = r0.A0E     // Catch:{ Exception -> 0x067a }
            org.json.JSONArray r0 = r0.A08     // Catch:{ Exception -> 0x067a }
            X.7bW r6 = new X.7bW     // Catch:{ Exception -> 0x067a }
            r6.<init>(r3, r0, r1, r7)     // Catch:{ Exception -> 0x067a }
            r14.A0H = r6     // Catch:{ Exception -> 0x067a }
            java.lang.String r3 = "ClientRiskRules"
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x067a }
            org.json.JSONObject r1 = r6.A0C     // Catch:{ Exception -> 0x067a }
            java.lang.String r0 = "deviceId"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x067a }
            r7.append(r0)     // Catch:{ Exception -> 0x067a }
            java.lang.String r0 = "mobileNumber"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x067a }
            r7.append(r0)     // Catch:{ Exception -> 0x067a }
            java.lang.String r0 = "accountRef"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x067a }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r7)     // Catch:{ Exception -> 0x067a }
            byte[] r0 = X.AnonymousClass36B.A04(r0)     // Catch:{ Exception -> 0x067a }
            java.lang.String r1 = X.C18290x4.A0t(r0)     // Catch:{ Exception -> 0x067a }
            r6.A09 = r1     // Catch:{ Exception -> 0x067a }
            android.content.Context r0 = r6.A03     // Catch:{ Exception -> 0x067a }
            X.2z8 r0 = X.C60772z8.A00(r0, r1)     // Catch:{ Exception -> 0x067a }
            r6.A0I = r0     // Catch:{ Exception -> 0x067a }
            java.lang.String r0 = r0.A01(r3)     // Catch:{ JSONException -> 0x060a }
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x060a }
            r6.A0E = r0     // Catch:{ JSONException -> 0x060a }
            goto L_0x0612
        L_0x060a:
            java.lang.String r0 = "{\"ATC\":\"0\",\"OTC\":\"0\",\"COTA\":\"0\"}"
            org.json.JSONObject r0 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ Exception -> 0x067a }
            r6.A0E = r0     // Catch:{ Exception -> 0x067a }
        L_0x0612:
            X.2z8 r0 = r6.A0I     // Catch:{ Exception -> 0x067a }
            r0.A02()     // Catch:{ Exception -> 0x067a }
            X.2z8 r1 = r6.A0I     // Catch:{ Exception -> 0x067a }
            org.json.JSONObject r0 = r6.A0E     // Catch:{ Exception -> 0x067a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x067a }
            r1.A03(r0, r3)     // Catch:{ Exception -> 0x067a }
            X.7bW r0 = r14.A0H     // Catch:{ Exception -> 0x067a }
            java.lang.String r0 = r0.A09     // Catch:{ Exception -> 0x067a }
            java.lang.String r3 = X.AnonymousClass36B.A00(r2, r0)     // Catch:{ Exception -> 0x067a }
            X.7bW r2 = r14.A0H     // Catch:{ Exception -> 0x067a }
            java.lang.String r1 = "AES"
            javax.crypto.SecretKey r0 = X.AnonymousClass6C8.A0n()     // Catch:{ Exception -> 0x067a }
            byte[] r0 = r0.getEncoded()     // Catch:{ Exception -> 0x067a }
            java.lang.String r6 = X.C18290x4.A0t(r0)     // Catch:{ Exception -> 0x067a }
            X.2z8 r0 = r2.A0I     // Catch:{ Exception -> 0x067a }
            r0.A03(r6, r1)     // Catch:{ Exception -> 0x067a }
            X.7bW r2 = r14.A0H     // Catch:{ Exception -> 0x067a }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r0)     // Catch:{ Exception -> 0x067a }
            r0 = 0
            r1.load(r0)     // Catch:{ Exception -> 0x067a }
            java.lang.String r0 = r2.A09     // Catch:{ Exception -> 0x067a }
            java.security.cert.Certificate[] r0 = r1.getCertificateChain(r0)     // Catch:{ Exception -> 0x067a }
            r0 = r0[r4]     // Catch:{ Exception -> 0x067a }
            byte[] r0 = r0.getEncoded()     // Catch:{ Exception -> 0x067a }
            java.lang.String r2 = X.C18290x4.A0t(r0)     // Catch:{ Exception -> 0x067a }
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x067a }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0m(r6, r5)     // Catch:{ Exception -> 0x067a }
            java.lang.String r0 = X.AnonymousClass000.A0U(r3, r5, r2, r0)     // Catch:{ Exception -> 0x067a }
            r1[r4] = r0     // Catch:{ Exception -> 0x067a }
            X.7bW r0 = r14.A0H     // Catch:{ Exception -> 0x067a }
            r0.A06(r1)     // Catch:{ Exception -> 0x067a }
            return
        L_0x066e:
            boolean r0 = r1.equals(r2)     // Catch:{ Exception -> 0x067a }
            if (r0 == 0) goto L_0x0683
            X.7bW r0 = r14.A0H     // Catch:{ Exception -> 0x067a }
            r0.A02()     // Catch:{ Exception -> 0x067a }
            return
        L_0x067a:
            android.content.Context r1 = r14.A0K
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            java.lang.String r0 = "TECHNICAL_ERROR"
            r1.A5p(r0)
        L_0x0683:
            return
        L_0x0684:
            r0 = 2131624056(0x7f0e0078, float:1.887528E38)
            r14.setContentView((int) r0)
            java.lang.Boolean r0 = r14.A09
            boolean r0 = r0.booleanValue()
            r13 = 0
            if (r0 == 0) goto L_0x06a1
            java.lang.String r0 = r14.A0C
            X.4MB r1 = new X.4MB
            r1.<init>(r14, r0)
            r14.A0F = r1
            java.lang.String[] r0 = new java.lang.String[r13]
            r1.execute(r0)
        L_0x06a1:
            r0 = 2131427890(0x7f0b0232, float:1.847741E38)
            android.view.View r1 = r14.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r14.A06 = r1
            android.graphics.Bitmap r0 = r14.A02
            if (r0 == 0) goto L_0x06b3
            r1.setImageBitmap(r0)
        L_0x06b3:
            java.lang.String r12 = "mobileNumber"
            java.lang.String r11 = "mandate"
            X.7Ug r0 = r14.A0G
            org.json.JSONObject r1 = r0.A0C
            java.lang.String r10 = ""
            if (r1 == 0) goto L_0x09fe
            java.lang.String r0 = "payerBankName"
            java.lang.String r18 = r1.optString(r0)
        L_0x06c5:
            X.7Ug r0 = r14.A0G
            org.json.JSONObject r2 = r0.A0E
            org.json.JSONArray r15 = r0.A09
            if (r2 != 0) goto L_0x07f8
            java.lang.String r2 = "l12"
            java.lang.String r1 = "l12.message"
            X.6zc r0 = new X.6zc
            r0.<init>(r14, r2, r1)
        L_0x06d6:
            r0 = 2131434407(0x7f0b1ba7, float:1.8490627E38)
            android.view.View r2 = r14.findViewById(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.7Ug r0 = r14.A0G
            org.json.JSONArray r0 = r0.A09
            r16 = r0
            r8 = 0
        L_0x06e6:
            int r0 = r16.length()
            if (r8 >= r0) goto L_0x0a02
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r14)
            r0 = 2131625271(0x7f0e0537, float:1.8877745E38)
            android.view.View r7 = r1.inflate(r0, r2, r13)
            r0 = 2131434405(0x7f0b1ba5, float:1.8490623E38)
            android.widget.TextView r6 = X.AnonymousClass002.A09(r7, r0)
            r0 = 2131434406(0x7f0b1ba6, float:1.8490625E38)
            android.widget.TextView r5 = X.AnonymousClass002.A09(r7, r0)
            r0 = 2131434622(0x7f0b1c7e, float:1.8491063E38)
            android.widget.TextView r15 = X.AnonymousClass002.A09(r7, r0)
            r0 = 2131434625(0x7f0b1c81, float:1.849107E38)
            android.view.View r1 = r7.findViewById(r0)
            r0 = r16
            org.json.JSONObject r9 = r0.optJSONObject(r8)
            java.lang.String r4 = "name"
            java.lang.String r3 = r9.optString(r4, r10)
            java.lang.String r0 = "payeeName"
            boolean r0 = r3.equals(r0)
            java.lang.String r3 = "value"
            if (r0 == 0) goto L_0x075c
            java.lang.String r0 = r14.A0B
            if (r0 == 0) goto L_0x0759
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0759
            java.lang.String r0 = "Mandate against"
        L_0x0735:
            java.lang.String r0 = r0.toUpperCase()
            r6.setText(r0)
            java.lang.String r0 = r9.optString(r3)
            r5.setText(r0)
            java.lang.String r0 = "VERIFIED MERCHANT"
            r15.setText(r0)
            java.lang.Boolean r0 = r14.A0A
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0753
            r1.setVisibility(r13)
        L_0x0753:
            r2.addView(r7)
            int r8 = r8 + 1
            goto L_0x06e6
        L_0x0759:
            java.lang.String r0 = "paying to"
            goto L_0x0735
        L_0x075c:
            java.lang.String r1 = r9.optString(r4, r10)
            java.lang.String r0 = "txnAmount"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x07d0
            java.lang.String r1 = r9.optString(r4, r10)
            java.lang.String r0 = "Amount"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x07d0
            java.lang.String r1 = r9.optString(r4, r10)
            java.lang.String r0 = "note"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0791
            java.lang.String r0 = "Details"
        L_0x0782:
            java.lang.String r0 = r0.toUpperCase()
            r6.setText(r0)
            java.lang.String r0 = r9.optString(r3)
        L_0x078d:
            r5.setText(r0)
            goto L_0x0753
        L_0x0791:
            java.lang.String r0 = r9.optString(r4, r10)
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x079e
            java.lang.String r0 = "Mobile"
            goto L_0x0782
        L_0x079e:
            java.lang.String r1 = r9.optString(r4, r10)
            java.lang.String r0 = "refUrl"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07ad
            java.lang.String r0 = "ref url"
            goto L_0x0782
        L_0x07ad:
            java.lang.String r1 = r9.optString(r4, r10)
            java.lang.String r0 = "refId"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07bc
            java.lang.String r0 = "Ref id"
            goto L_0x0782
        L_0x07bc:
            java.lang.String r1 = r9.optString(r4, r10)
            java.lang.String r0 = "mandateSubType"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07cb
            java.lang.String r0 = "Mandate Type"
            goto L_0x0782
        L_0x07cb:
            java.lang.String r0 = r9.optString(r4)
            goto L_0x0782
        L_0x07d0:
            java.lang.String r0 = r14.A0B
            if (r0 == 0) goto L_0x07f5
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x07f5
            java.lang.String r0 = "Maximum Mandate Amount"
        L_0x07dc:
            java.lang.String r0 = r0.toUpperCase()
            r6.setText(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "₹ "
            r1.append(r0)
            java.lang.String r0 = r9.optString(r3)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            goto L_0x078d
        L_0x07f5:
            java.lang.String r0 = "AMOUNT"
            goto L_0x07dc
        L_0x07f8:
            java.lang.String r0 = "txnAmount"
            java.lang.String r9 = r2.optString(r0)
            X.7Ug r1 = r14.A0G     // Catch:{ JSONException -> 0x082e }
            java.lang.String r0 = "credType"
            org.json.JSONArray r0 = r2.getJSONArray(r0)     // Catch:{ JSONException -> 0x082e }
            r1.A0A = r0     // Catch:{ JSONException -> 0x082e }
            r1 = 0
        L_0x0809:
            X.7Ug r0 = r14.A0G     // Catch:{ JSONException -> 0x082e }
            org.json.JSONArray r0 = r0.A0A     // Catch:{ JSONException -> 0x082e }
            int r0 = r0.length()     // Catch:{ JSONException -> 0x082e }
            if (r1 >= r0) goto L_0x0832
            X.7Ug r0 = r14.A0G     // Catch:{ JSONException -> 0x082e }
            org.json.JSONArray r0 = r0.A0A     // Catch:{ JSONException -> 0x082e }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x082e }
            boolean r0 = r0.equals(r11)     // Catch:{ JSONException -> 0x082e }
            if (r0 == 0) goto L_0x082b
            X.7Ug r0 = r14.A0G     // Catch:{ JSONException -> 0x082e }
            org.json.JSONArray r0 = r0.A0A     // Catch:{ JSONException -> 0x082e }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x082e }
            r14.A0B = r0     // Catch:{ JSONException -> 0x082e }
        L_0x082b:
            int r1 = r1 + 1
            goto L_0x0809
        L_0x082e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0832:
            r1 = r10
            r4 = 0
        L_0x0834:
            int r0 = r15.length()
            java.lang.String r3 = "account"
            java.lang.String r8 = "value"
            java.lang.String r7 = "name"
            if (r4 >= r0) goto L_0x088d
            java.lang.String r0 = X.AnonymousClass6C7.A0m(r7, r15, r4)     // Catch:{ Exception -> 0x088a }
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x088a }
            if (r0 == 0) goto L_0x0873
            java.lang.Object r0 = r15.get(r4)     // Catch:{ Exception -> 0x088a }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x088a }
            java.lang.String r1 = r0.optString(r8, r10)     // Catch:{ Exception -> 0x088a }
            int r0 = r1.length()     // Catch:{ Exception -> 0x088a }
            int r2 = r0 + -4
            int r0 = r1.length()     // Catch:{ Exception -> 0x088a }
            java.lang.String r1 = r1.substring(r2, r0)     // Catch:{ Exception -> 0x088a }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x088a }
            java.lang.String r0 = "XXXX"
            r2.append(r0)     // Catch:{ Exception -> 0x088a }
            r2.append(r1)     // Catch:{ Exception -> 0x088a }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x088a }
            goto L_0x088d
        L_0x0873:
            java.lang.String r2 = X.AnonymousClass6C7.A0m(r7, r15, r4)     // Catch:{ Exception -> 0x088a }
            java.lang.String r0 = "payeeVpa"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x088a }
            if (r0 == 0) goto L_0x088a
            java.lang.Object r0 = r15.get(r4)     // Catch:{ Exception -> 0x088a }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x088a }
            java.lang.String r1 = r0.optString(r8, r10)     // Catch:{ Exception -> 0x088a }
            goto L_0x088d
        L_0x088a:
            int r4 = r4 + 1
            goto L_0x0834
        L_0x088d:
            r2 = 0
        L_0x088e:
            int r0 = r15.length()
            if (r2 >= r0) goto L_0x08ce
            java.lang.String r4 = X.AnonymousClass6C7.A0m(r7, r15, r2)     // Catch:{ Exception -> 0x08cb }
            java.lang.String r0 = "payeeName"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x08cb }
            if (r0 == 0) goto L_0x08ab
            java.lang.Object r0 = r15.get(r2)     // Catch:{ Exception -> 0x08cb }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x08cb }
        L_0x08a6:
            java.lang.String r6 = r0.optString(r8, r10)     // Catch:{ Exception -> 0x08cb }
            goto L_0x08cf
        L_0x08ab:
            java.lang.String r0 = X.AnonymousClass6C7.A0m(r7, r15, r2)     // Catch:{ Exception -> 0x08cb }
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x08cb }
            if (r0 == 0) goto L_0x08bc
            java.lang.Object r0 = r15.get(r2)     // Catch:{ Exception -> 0x08cb }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x08cb }
            goto L_0x08a6
        L_0x08bc:
            java.lang.String r0 = X.AnonymousClass6C7.A0m(r7, r15, r2)     // Catch:{ Exception -> 0x08cb }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x08cb }
            if (r0 == 0) goto L_0x08cb
            java.lang.String r6 = X.AnonymousClass6C7.A0m(r12, r15, r2)     // Catch:{ Exception -> 0x08cb }
            goto L_0x08cf
        L_0x08cb:
            int r2 = r2 + 1
            goto L_0x088e
        L_0x08ce:
            r6 = r10
        L_0x08cf:
            r0 = 2131434396(0x7f0b1b9c, float:1.8490605E38)
            android.view.View r20 = r14.findViewById(r0)
            r0 = 2131434457(0x7f0b1bd9, float:1.8490728E38)
            android.widget.TextView r17 = X.C18310x6.A0L(r14, r0)
            r0 = 2131434458(0x7f0b1bda, float:1.849073E38)
            android.widget.TextView r16 = X.C18310x6.A0L(r14, r0)
            r0 = 2131434423(0x7f0b1bb7, float:1.849066E38)
            android.widget.TextView r5 = X.C18310x6.A0L(r14, r0)
            r0 = 2131434424(0x7f0b1bb8, float:1.8490662E38)
            android.widget.TextView r4 = X.C18310x6.A0L(r14, r0)
            r0 = 2131434393(0x7f0b1b99, float:1.8490599E38)
            android.widget.TextView r3 = X.C18310x6.A0L(r14, r0)
            r0 = 2131434394(0x7f0b1b9a, float:1.84906E38)
            android.widget.TextView r2 = X.C18310x6.A0L(r14, r0)
            r0 = 2131434395(0x7f0b1b9b, float:1.8490603E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r14.A07 = r0
            r0 = r16
            r0.setText(r1)
            r0 = r18
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x091f
            r1 = r17
            r0 = r18
            r1.setText(r0)
        L_0x091f:
            boolean r0 = r9.equals(r10)
            r1 = 1
            if (r0 != 0) goto L_0x09c4
            java.lang.String r0 = "null"
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x09c4
            double r18 = java.lang.Double.parseDouble(r9)
            r16 = 0
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x09c4
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "₹ "
            java.lang.String r7 = X.AnonymousClass000.A0V(r0, r9, r7)
            java.lang.String r0 = r14.A0B
            if (r0 == 0) goto L_0x09bc
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x09bc
            java.lang.String r0 = "Maximum Mandate Amount: "
            r3.setText(r0)
            java.lang.String r0 = "Mandate Against: "
        L_0x0953:
            r5.setText(r0)
            r2.setText(r7)
            r4.setText(r6)
        L_0x095c:
            android.view.WindowManager r0 = r14.getWindowManager()
            android.view.Display r2 = r0.getDefaultDisplay()
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            r2.getSize(r0)
            int r0 = r0.y
            r14.A00 = r0
            r0 = 32
            X.5eZ r2 = new X.5eZ
            r2.<init>(r14, r0)
            r0 = r20
            r0.setOnClickListener(r2)
            r0 = 2131434408(0x7f0b1ba8, float:1.849063E38)
            android.view.View r0 = r14.findViewById(r0)
            r14.A04 = r0
            r0 = 2131434404(0x7f0b1ba4, float:1.849062E38)
            android.view.View r0 = r14.findViewById(r0)
            r14.A05 = r0
            android.view.View r3 = r14.A04
            r2 = 12
            X.5CS r0 = new X.5CS
            r0.<init>(r14, r2)
            r3.setOnTouchListener(r0)
            android.view.View r3 = r14.A05
            if (r3 == 0) goto L_0x09a8
            r2 = 13
            X.5CS r0 = new X.5CS
            r0.<init>(r14, r2)
            r3.setOnTouchListener(r0)
        L_0x09a8:
            r0 = 2131434413(0x7f0b1bad, float:1.849064E38)
            android.view.View r0 = r14.findViewById(r0)
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r14.A03 = r0
            r0.setCrossFadeEnabled(r1)
            goto L_0x06d6
        L_0x09bc:
            java.lang.String r0 = "Sending: "
            r3.setText(r0)
            java.lang.String r0 = "To: "
            goto L_0x0953
        L_0x09c4:
            r3.setText(r10)
            r5.setText(r10)
            r2.setText(r10)
            r4.setText(r10)
            r4 = 0
        L_0x09d1:
            int r0 = r15.length()
            if (r4 >= r0) goto L_0x09f1
            java.lang.String r2 = X.AnonymousClass6C7.A0m(r7, r15, r4)     // Catch:{ Exception -> 0x09ee }
            java.lang.String r0 = "note"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x09ee }
            if (r0 == 0) goto L_0x09ee
            java.lang.Object r0 = r15.get(r4)     // Catch:{ Exception -> 0x09ee }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x09ee }
            java.lang.String r6 = r0.optString(r8, r10)     // Catch:{ Exception -> 0x09ee }
            goto L_0x09f1
        L_0x09ee:
            int r4 = r4 + 1
            goto L_0x09d1
        L_0x09f1:
            r3.setText(r6)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r0)
            r3.setSingleLine(r1)
            goto L_0x095c
        L_0x09fe:
            r18 = r10
            goto L_0x06c5
        L_0x0a02:
            android.view.View r3 = new android.view.View
            r3.<init>(r14)
            r1 = 1077936128(0x40400000, float:3.0)
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0B(r14)
            int r0 = r0.densityDpi
            int r0 = r0 / 160
            float r0 = (float) r0
            float r1 = r1 * r0
            int r1 = (int) r1
            r0 = -1
            X.C86654Ky.A14(r3, r0, r1)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setBackgroundColor(r0)
            r0 = 1051260355(0x3ea8f5c3, float:0.33)
            r3.setAlpha(r0)
            r2.addView(r3)
            r0 = 2131430247(0x7f0b0b67, float:1.848219E38)
            android.view.View r5 = r14.findViewById(r0)
            org.npci.upi.security.pinactivitycomponent.Keypad r5 = (org.npci.upi.security.pinactivitycomponent.Keypad) r5
            if (r5 == 0) goto L_0x0a38
            X.8Px r0 = new X.8Px
            r0.<init>(r14)
            r5.A04 = r0
        L_0x0a38:
            r0 = 2131434332(0x7f0b1b5c, float:1.8490475E38)
            android.view.View r1 = r14.findViewById(r0)
            r0 = 10
            r1.setPadding(r13, r0, r13, r13)
            r0 = 2131431153(0x7f0b0ef1, float:1.8484027E38)
            android.view.View r4 = r14.findViewById(r0)
            r0 = 2131434413(0x7f0b1bad, float:1.849064E38)
            android.view.View r3 = r14.findViewById(r0)
            android.util.DisplayMetrics r2 = X.AnonymousClass000.A0B(r14)
            int r1 = r2.densityDpi
            r0 = 320(0x140, float:4.48E-43)
            if (r1 > r0) goto L_0x0a91
            int r1 = r2.heightPixels
            r0 = 1184(0x4a0, float:1.659E-42)
            if (r1 > r0) goto L_0x0a91
            r0 = 800(0x320, float:1.121E-42)
            if (r1 > r0) goto L_0x0a71
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            r0 = 280(0x118, float:3.92E-43)
            r1.height = r0
            r5.setLayoutParams(r1)
        L_0x0a71:
            r1 = 0
        L_0x0a72:
            X.7Ug r0 = r14.A0G
            java.lang.Boolean r0 = r0.A02
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0a8d
            r0 = 8
            r3.setVisibility(r0)
        L_0x0a81:
            org.npci.upi.security.pinactivitycomponent.w r2 = new org.npci.upi.security.pinactivitycomponent.w
            r2.<init>()
            r14.A08 = r2
            android.os.Bundle r1 = X.C86614Ku.A0D(r14)
            goto L_0x0a94
        L_0x0a8d:
            r4.setPadding(r13, r1, r13, r13)
            goto L_0x0a81
        L_0x0a91:
            r1 = 50
            goto L_0x0a72
        L_0x0a94:
            X.0df r0 = r14.getSupportFragmentManager()     // Catch:{ Exception -> 0x0ad8 }
            if (r1 == 0) goto L_0x0a9d
            r2.A0u(r1)     // Catch:{ Exception -> 0x0ad8 }
        L_0x0a9d:
            X.0dc r1 = new X.0dc     // Catch:{ Exception -> 0x0ad8 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0ad8 }
            r0 = 2131431153(0x7f0b0ef1, float:1.8484027E38)
            r1.A0A(r2, r0)     // Catch:{ Exception -> 0x0ad8 }
            r1.A02()     // Catch:{ Exception -> 0x0ad8 }
            r14.A0I = r2     // Catch:{ Exception -> 0x0ad8 }
            goto L_0x0ad8
        L_0x0aae:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0aeb }
            int r0 = r4.a     // Catch:{ Exception -> 0x0aeb }
            r1.append(r0)     // Catch:{ Exception -> 0x0aeb }
            java.lang.String r0 = ""
            java.lang.String r3 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ Exception -> 0x0aeb }
            java.lang.String r1 = r4.b     // Catch:{ Exception -> 0x0aeb }
            android.os.Bundle r2 = X.AnonymousClass002.A08()     // Catch:{ Exception -> 0x0aeb }
            java.lang.String r0 = "errorCode"
            r2.putString(r0, r3)     // Catch:{ Exception -> 0x0aeb }
            java.lang.String r0 = "error"
            r2.putString(r0, r1)     // Catch:{ Exception -> 0x0aeb }
            android.os.ResultReceiver r1 = X.AnonymousClass7Q1.A0B     // Catch:{ Exception -> 0x0aeb }
            r0 = 0
            r1.send(r0, r2)     // Catch:{ Exception -> 0x0aeb }
            r14.finish()     // Catch:{ Exception -> 0x0aeb }
            throw r4     // Catch:{ Exception -> 0x0aeb }
        L_0x0ad8:
            r0 = 2131430372(0x7f0b0be4, float:1.8482443E38)
            android.view.View r2 = r14.findViewById(r0)
            if (r2 == 0) goto L_0x0aeb
            r1 = 31
            X.5eZ r0 = new X.5eZ
            r0.<init>(r14, r1)
            r2.setOnClickListener(r0)
        L_0x0aeb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.GetCredential.onCreate(android.os.Bundle):void");
    }

    public GetCredential() {
        Boolean bool = Boolean.FALSE;
        this.A0C = "";
        this.A09 = bool;
        this.A02 = null;
        this.A0A = bool;
        this.A0B = null;
        A0L = this;
    }

    public void A5p(String str) {
        Bundle A082 = AnonymousClass002.A08();
        A082.putString("error", str);
        AnonymousClass7Q1.A0B.send(0, A082);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 0) {
            try {
                C153547bW r1 = this.A0H;
                r1.A04(r1.A05);
            } catch (Exception unused) {
                ((GetCredential) this.A0K).A5p("TECHNICAL_ERROR");
            }
        } else if (i == 1) {
            this.A0H.A02();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (A0L != null) {
            A0L = null;
        }
        Thread.currentThread().setUncaughtExceptionHandler(this.A0D);
    }

    public void onPause() {
        super.onPause();
        try {
            C124396Cc r0 = this.A0E;
            if (r0 != null) {
                unregisterReceiver(r0);
                this.A0E = null;
            }
        } catch (Throwable unused) {
        }
    }

    public void onResume() {
        super.onResume();
        if (checkCallingOrSelfPermission("android.permission.RECEIVE_SMS") == 0) {
            this.A0E = new C124396Cc(this);
            IntentFilter intentFilter = new IntentFilter();
            try {
                intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
                intentFilter.setPriority(999);
                registerReceiver(this.A0E, intentFilter);
            } catch (Throwable unused) {
            }
        }
    }
}
