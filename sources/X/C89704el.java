package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.TypedValue;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.android.di.BaseEntryPoint;
import com.whatsapp.util.Log;
import java.util.AbstractMap;

/* renamed from: X.4el  reason: invalid class name and case insensitive filesystem */
public class C89704el extends C89684ei {
    public C620733j A00;
    public AnonymousClass1VX A01;
    public C56592sF A02;
    public C186568vZ A03;
    public AnonymousClass4FS A04;
    public boolean A05 = true;
    public boolean A06 = true;
    public MessageQueue.IdleHandler A07 = null;
    public Toolbar A08;
    public C18570xu A09;
    public AnonymousClass4VG A0A;
    public boolean A0B;
    public boolean A0C = true;
    public C1222963v A0D;
    public AnonymousClass8JP A0E;
    public C187958y5 A0F;
    public C183538qC A0G;

    public void startActivityForResult(Intent intent, int i) {
        if (i != -1) {
            C621633u.A03(intent);
            if (i != -1 && this.A01.A0X(5831)) {
                C58552vR r4 = (C58552vR) this.A0G.get();
                String A0O = AnonymousClass000.A0O(this);
                C18260x0.A0O(A0O, intent);
                r4.A00.execute(new C71403c3(r4, intent, A0O, 20));
            }
        }
        super.startActivityForResult(intent, i);
    }

    private void A4v() {
        AnonymousClass4VG r1 = this.A0A;
        if (r1 != null && this.A07 != null && !(r1 instanceof AnonymousClass57B)) {
            AnonymousClass57C r12 = (AnonymousClass57C) r1;
            if (r12.A01) {
                r12.A00 = false;
                Looper.myQueue().addIdleHandler(this.A07);
            }
        }
    }

    private void A4w() {
        AnonymousClass4VG r2 = this.A0A;
        if (r2 != null && this.A07 != null) {
            if (!(r2 instanceof AnonymousClass57B)) {
                ((AnonymousClass57C) r2).A00 = true;
            }
            Looper.myQueue().removeIdleHandler(this.A07);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0148, code lost:
        r5 = r2.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A53(X.C89704el r16) {
        /*
            r4 = r16
            X.4VG r0 = r4.A0A
            if (r0 == 0) goto L_0x01c8
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x01c8
            X.4VG r7 = r4.A0A
            boolean r0 = r7 instanceof X.AnonymousClass57B
            if (r0 != 0) goto L_0x01c8
            X.57C r7 = (X.AnonymousClass57C) r7
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x01c8
            X.5Vq r8 = X.C105595Vq.A01     // Catch:{ Exception -> 0x01a0 }
            r10 = 0
            X.5Ja r9 = r8.A00     // Catch:{ Exception -> 0x01a0 }
            boolean r0 = r9.A03     // Catch:{ Exception -> 0x01a0 }
            if (r0 != 0) goto L_0x00b4
            java.lang.String r16 = "reflective setup failed using obj: %s method: %s field: %s"
            java.lang.String r15 = "mParams"
            java.lang.String r12 = "mViews"
            r14 = 1
            r9.A03 = r14     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r1 = "android.view.WindowManagerGlobal"
            java.lang.String r13 = "getInstance"
            r6 = 3
            r5 = 2
            r11 = 0
            java.lang.Class r2 = java.lang.Class.forName(r1)     // Catch:{ InvocationTargetException -> 0x007b, ClassNotFoundException -> 0x0089, NoSuchFieldException -> 0x009e, NoSuchMethodException -> 0x006d, IllegalAccessException | RuntimeException -> 0x005a }
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ InvocationTargetException -> 0x007b, ClassNotFoundException -> 0x0089, NoSuchFieldException -> 0x009e, NoSuchMethodException -> 0x006d, IllegalAccessException | RuntimeException -> 0x005a }
            java.lang.reflect.Method r3 = r2.getMethod(r13, r0)     // Catch:{ InvocationTargetException -> 0x007b, ClassNotFoundException -> 0x0089, NoSuchFieldException -> 0x009e, NoSuchMethodException -> 0x006d, IllegalAccessException | RuntimeException -> 0x005a }
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ InvocationTargetException -> 0x007b, ClassNotFoundException -> 0x0089, NoSuchFieldException -> 0x009e, NoSuchMethodException -> 0x006d, IllegalAccessException | RuntimeException -> 0x005a }
            java.lang.Object r0 = r3.invoke(r10, r0)     // Catch:{ InvocationTargetException -> 0x007b, ClassNotFoundException -> 0x0089, NoSuchFieldException -> 0x009e, NoSuchMethodException -> 0x006d, IllegalAccessException | RuntimeException -> 0x005a }
            r9.A00 = r0     // Catch:{ InvocationTargetException -> 0x007b, ClassNotFoundException -> 0x0089, NoSuchFieldException -> 0x009e, NoSuchMethodException -> 0x006d, IllegalAccessException | RuntimeException -> 0x005a }
            java.lang.reflect.Field r0 = r2.getDeclaredField(r12)     // Catch:{ InvocationTargetException -> 0x007b, ClassNotFoundException -> 0x0089, NoSuchFieldException -> 0x009e, NoSuchMethodException -> 0x006d, IllegalAccessException | RuntimeException -> 0x005a }
            r9.A02 = r0     // Catch:{ InvocationTargetException -> 0x007b, ClassNotFoundException -> 0x0089, NoSuchFieldException -> 0x009e, NoSuchMethodException -> 0x006d, IllegalAccessException | RuntimeException -> 0x005a }
            if (r0 == 0) goto L_0x004e
            r0.setAccessible(r14)     // Catch:{ InvocationTargetException -> 0x007b, ClassNotFoundException -> 0x0089, NoSuchFieldException -> 0x009e, NoSuchMethodException -> 0x006d, IllegalAccessException | RuntimeException -> 0x005a }
        L_0x004e:
            java.lang.reflect.Field r0 = r2.getDeclaredField(r15)     // Catch:{ InvocationTargetException -> 0x007b, ClassNotFoundException -> 0x0089, NoSuchFieldException -> 0x009e, NoSuchMethodException -> 0x006d, IllegalAccessException | RuntimeException -> 0x005a }
            r9.A01 = r0     // Catch:{ InvocationTargetException -> 0x007b, ClassNotFoundException -> 0x0089, NoSuchFieldException -> 0x009e, NoSuchMethodException -> 0x006d, IllegalAccessException | RuntimeException -> 0x005a }
            if (r0 == 0) goto L_0x00b4
            r0.setAccessible(r14)     // Catch:{ InvocationTargetException -> 0x007b, ClassNotFoundException -> 0x0089, NoSuchFieldException -> 0x009e, NoSuchMethodException -> 0x006d, IllegalAccessException | RuntimeException -> 0x005a }
            goto L_0x00b4
        L_0x005a:
            r3 = move-exception
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object[] r1 = X.AnonymousClass4L0.A0V(r1, r13, r6)     // Catch:{ Exception -> 0x01a0 }
            r1[r5] = r12     // Catch:{ Exception -> 0x01a0 }
            r0 = r16
            java.lang.String r0 = X.C86634Kw.A10(r0, r2, r1, r6)     // Catch:{ Exception -> 0x01a0 }
            com.whatsapp.util.Log.d(r0, r3)     // Catch:{ Exception -> 0x01a0 }
            goto L_0x00b4
        L_0x006d:
            r3 = move-exception
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r13, r1, r5)     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r5)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r0 = "could not find method: %s on %s"
            goto L_0x0096
        L_0x007b:
            r3 = move-exception
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r13, r1, r5)     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r5)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r0 = "could not invoke: %s on %s"
            goto L_0x0096
        L_0x0089:
            r3 = move-exception
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x01a0 }
            r0[r11] = r1     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r14)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r0 = "could not find class: %s"
        L_0x0096:
            java.lang.String r0 = X.C86654Ky.A0n(r2, r0, r1)     // Catch:{ Exception -> 0x01a0 }
            com.whatsapp.util.Log.d(r0, r3)     // Catch:{ Exception -> 0x01a0 }
            goto L_0x00b4
        L_0x009e:
            r3 = move-exception
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r15, r12, r6)     // Catch:{ Exception -> 0x01a0 }
            r0[r5] = r1     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r6)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r0 = "could not find field: %s or %s on %s"
            java.lang.String r0 = X.C86654Ky.A0n(r2, r0, r1)     // Catch:{ Exception -> 0x01a0 }
            com.whatsapp.util.Log.d(r0, r3)     // Catch:{ Exception -> 0x01a0 }
        L_0x00b4:
            java.lang.Object r2 = r9.A00     // Catch:{ Exception -> 0x01a0 }
            r12 = 0
            if (r2 != 0) goto L_0x00c0
            java.lang.String r0 = "No reflective access to windowmanager object."
        L_0x00bb:
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ Exception -> 0x01a0 }
            goto L_0x01a6
        L_0x00c0:
            java.lang.reflect.Field r1 = r9.A02     // Catch:{ Exception -> 0x01a0 }
            if (r1 != 0) goto L_0x00c7
            java.lang.String r0 = "No reflective access to mViews"
            goto L_0x00bb
        L_0x00c7:
            java.lang.reflect.Field r0 = r9.A01     // Catch:{ Exception -> 0x01a0 }
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = "No reflective access to mPArams"
            goto L_0x00bb
        L_0x00ce:
            r14 = 2
            r6 = 3
            java.lang.String r5 = "Reflective access to %s or %s on %s failed."
            r13 = 1
            r11 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch:{ RuntimeException -> 0x0187, IllegalAccessException -> 0x0171 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ RuntimeException -> 0x0187, IllegalAccessException -> 0x0171 }
            java.lang.reflect.Field r1 = r9.A01     // Catch:{ RuntimeException -> 0x0187, IllegalAccessException -> 0x0171 }
            if (r1 == 0) goto L_0x00e4
            java.lang.Object r0 = r9.A00     // Catch:{ RuntimeException -> 0x0187, IllegalAccessException -> 0x0171 }
            java.lang.Object r12 = r1.get(r0)     // Catch:{ RuntimeException -> 0x0187, IllegalAccessException -> 0x0171 }
        L_0x00e4:
            java.util.List r12 = (java.util.List) r12     // Catch:{ RuntimeException -> 0x0187, IllegalAccessException -> 0x0171 }
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()     // Catch:{ Exception -> 0x01a0 }
            if (r2 == 0) goto L_0x0119
            java.util.Iterator r5 = r2.iterator()     // Catch:{ Exception -> 0x01a0 }
        L_0x00f0:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x01a0 }
            if (r0 == 0) goto L_0x0119
            java.lang.Object r3 = r5.next()     // Catch:{ Exception -> 0x01a0 }
            int r2 = r11 + 1
            if (r11 >= 0) goto L_0x0103
            java.lang.RuntimeException r0 = X.C18280x3.A0X()     // Catch:{ Exception -> 0x01a0 }
            throw r0     // Catch:{ Exception -> 0x01a0 }
        L_0x0103:
            android.view.View r3 = (android.view.View) r3     // Catch:{ Exception -> 0x01a0 }
            if (r12 == 0) goto L_0x0117
            java.lang.Object r1 = r12.get(r11)     // Catch:{ Exception -> 0x01a0 }
            android.view.WindowManager$LayoutParams r1 = (android.view.WindowManager.LayoutParams) r1     // Catch:{ Exception -> 0x01a0 }
            if (r1 == 0) goto L_0x0117
            X.5ID r0 = new X.5ID     // Catch:{ Exception -> 0x01a0 }
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x01a0 }
            r6.add(r0)     // Catch:{ Exception -> 0x01a0 }
        L_0x0117:
            r11 = r2
            goto L_0x00f0
        L_0x0119:
            boolean r0 = r6.isEmpty()     // Catch:{ Exception -> 0x01a0 }
            if (r0 != 0) goto L_0x01a6
            r5 = 0
            int r0 = r6.size()     // Catch:{ Exception -> 0x01a0 }
            r2 = r5
        L_0x0125:
            int r3 = r0 + -1
            if (r0 <= 0) goto L_0x012a
            goto L_0x012d
        L_0x012a:
            if (r2 == 0) goto L_0x014a
            goto L_0x0148
        L_0x012d:
            java.lang.Object r2 = r6.get(r3)     // Catch:{ Exception -> 0x01a0 }
            X.5ID r2 = (X.AnonymousClass5ID) r2     // Catch:{ Exception -> 0x01a0 }
            android.view.View r1 = r2.A00     // Catch:{ Exception -> 0x01a0 }
            boolean r0 = X.C162457s7.A0P(r1, r10)     // Catch:{ Exception -> 0x01a0 }
            if (r0 != 0) goto L_0x016f
            r0 = 2131430179(0x7f0b0b23, float:1.8482052E38)
            java.lang.Object r0 = r1.getTag(r0)     // Catch:{ Exception -> 0x01a0 }
            boolean r0 = X.AnonymousClass0x9.A1Q(r0)     // Catch:{ Exception -> 0x01a0 }
            if (r0 != 0) goto L_0x016f
        L_0x0148:
            android.view.View r5 = r2.A00     // Catch:{ Exception -> 0x01a0 }
        L_0x014a:
            boolean r0 = r5 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x01a0 }
            if (r0 == 0) goto L_0x01a6
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch:{ Exception -> 0x01a0 }
            X.57D r6 = new X.57D     // Catch:{ Exception -> 0x01a0 }
            r6.<init>(r5, r8)     // Catch:{ Exception -> 0x01a0 }
            X.8qC r0 = r7.A03     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object r5 = r0.get()     // Catch:{ Exception -> 0x01a0 }
            X.5KN r5 = (X.AnonymousClass5KN) r5     // Catch:{ Exception -> 0x01a0 }
            X.5yt r3 = new X.5yt     // Catch:{ Exception -> 0x01a0 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x01a0 }
            X.4FS r2 = r5.A02     // Catch:{ Exception -> 0x01a0 }
            r1 = 39
            X.3aN r0 = new X.3aN     // Catch:{ Exception -> 0x01a0 }
            r0.<init>(r5, r6, r3, r1)     // Catch:{ Exception -> 0x01a0 }
            r2.BkM(r0)     // Catch:{ Exception -> 0x01a0 }
            goto L_0x01a6
        L_0x016f:
            r0 = r3
            goto L_0x0125
        L_0x0171:
            r3 = move-exception
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x01a0 }
            java.lang.reflect.Field r0 = r9.A02     // Catch:{ Exception -> 0x01a0 }
            r1[r11] = r0     // Catch:{ Exception -> 0x01a0 }
            java.lang.reflect.Field r0 = r9.A01     // Catch:{ Exception -> 0x01a0 }
            r1[r13] = r0     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object r0 = r9.A00     // Catch:{ Exception -> 0x01a0 }
            r1[r14] = r0     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r0 = X.C86634Kw.A10(r5, r2, r1, r6)     // Catch:{ Exception -> 0x01a0 }
            goto L_0x019c
        L_0x0187:
            r3 = move-exception
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x01a0 }
            java.lang.reflect.Field r0 = r9.A02     // Catch:{ Exception -> 0x01a0 }
            r1[r11] = r0     // Catch:{ Exception -> 0x01a0 }
            java.lang.reflect.Field r0 = r9.A01     // Catch:{ Exception -> 0x01a0 }
            r1[r13] = r0     // Catch:{ Exception -> 0x01a0 }
            java.lang.Object r0 = r9.A00     // Catch:{ Exception -> 0x01a0 }
            r1[r14] = r0     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r0 = X.C86634Kw.A10(r5, r2, r1, r6)     // Catch:{ Exception -> 0x01a0 }
        L_0x019c:
            com.whatsapp.util.Log.d(r0, r3)     // Catch:{ Exception -> 0x01a0 }
            goto L_0x01a6
        L_0x01a0:
            r1 = move-exception
            java.lang.String r0 = "Failed to create log hierarchy"
            com.whatsapp.util.Log.d(r0, r1)
        L_0x01a6:
            android.os.Handler r3 = X.AnonymousClass000.A0A()
            r0 = 17
            X.3Zq r2 = new X.3Zq
            r2.<init>(r4, r0)
            X.4VG r1 = r4.A0A
            boolean r0 = r1 instanceof X.AnonymousClass57B
            if (r0 == 0) goto L_0x01bd
            r0 = 0
        L_0x01b8:
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            return
        L_0x01bd:
            X.57C r1 = (X.AnonymousClass57C) r1
            X.5Ko r0 = r1.A02
            X.66R r0 = r0.A05
            int r0 = X.AnonymousClass0x2.A09(r0)
            goto L_0x01b8
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89704el.A53(X.4el):void");
    }

    public static /* synthetic */ void A58(C89704el r2) {
        AnonymousClass4VG r1 = r2.A0A;
        if (!(r1 instanceof AnonymousClass57B) && !((AnonymousClass57C) r1).A00 && r2.A07 != null) {
            Looper.myQueue().addIdleHandler(r2.A07);
        }
    }

    public void A65() {
    }

    public void A66() {
    }

    public void A68(boolean z) {
        Integer num;
        this.A0C = z;
        if (z) {
            Toolbar toolbar = this.A08;
            if ((toolbar instanceof AnonymousClass578) && C1001059l.A03) {
                Window window = getWindow();
                boolean A1U = C18270x1.A1U(toolbar, window);
                if ((toolbar instanceof AnonymousClass578) && (num = ((AnonymousClass578) toolbar).A08.A03) != null) {
                    AnonymousClass5CQ.A00(window, num.intValue(), A1U);
                }
            }
        }
    }

    public boolean A6B() {
        return false;
    }

    public boolean A6C() {
        return false;
    }

    public AnonymousClass0R2 Bpz(C16910uE r3) {
        if ((this.A08 instanceof AnonymousClass578) && C1001059l.A03) {
            r3 = new C110345g5(r3, C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        }
        return super.Bpz(r3);
    }

    public C186568vZ getQuickPerformanceLogger() {
        return this.A03;
    }

    public Resources getResources() {
        C18570xu r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        if (this.A00 == null) {
            Log.i("wabaseappcompatactivity/get resources object/returning super resources");
            return super.getResources();
        }
        C18570xu A022 = C18570xu.A02(super.getResources(), this.A00);
        this.A09 = A022;
        return A022;
    }

    public C56592sF getStartupTracker() {
        return this.A02;
    }

    public AnonymousClass4FS getWaWorkers() {
        return this.A04;
    }

    public C620733j getWhatsAppLocale() {
        return this.A00;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C620733j r0 = this.A00;
        if (r0 != null) {
            r0.A0P();
        }
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        this.A00.A0P();
        if (this.A05) {
            if (C106545Zk.A04(this.A01, (C58422vE) null, 4864)) {
                getTheme().applyStyle(R.style.f12nameremoved, true);
            }
            Resources.Theme theme = getTheme();
            AnonymousClass1VX r3 = this.A01;
            C187958y5 r2 = this.A0F;
            C162457s7.A0J(theme, 0);
            C18270x1.A10(r3, 1, r2);
            if (C1001059l.A03) {
                theme.applyStyle(R.style.f12nameremoved, true);
            }
            if (C1001059l.A02) {
                boolean A1U = AnonymousClass000.A1U(AnonymousClass001.A0M(this).uiMode & 48, 32);
                Boolean bool = AnonymousClass34K.A00;
                if (bool == null) {
                    AnonymousClass34K.A00 = Boolean.valueOf(A1U);
                } else {
                    Boolean valueOf = Boolean.valueOf(A1U);
                    if (!C162457s7.A0P(valueOf, bool)) {
                        AnonymousClass34K.A00 = valueOf;
                        Log.d("Dark/Light mode changed, clearing color cache");
                        Log.d("ColorCache cleared");
                        ((AbstractMap) AnonymousClass5Yj.A00.getValue()).clear();
                    }
                }
            }
        }
        super.onCreate(bundle);
        if (this.A06 && C1001059l.A03) {
            try {
                TypedValue A0B2 = AnonymousClass4L0.A0B();
                TypedValue A0B3 = AnonymousClass4L0.A0B();
                Resources.Theme theme2 = getTheme();
                if (theme2 != null) {
                    theme2.resolveAttribute(16842836, A0B2, true);
                }
                Resources.Theme theme3 = getTheme();
                if (theme3 != null) {
                    theme3.resolveAttribute(R.attr.f3nameremoved, A0B3, true);
                }
                int i = A0B2.resourceId;
                int i2 = A0B3.resourceId;
                if (i == i2) {
                    getWindow().setBackgroundDrawableResource(i2);
                }
            } catch (Exception unused) {
                Log.w("Can't resolve windowBackground resource");
            }
            Window window = getWindow();
            C162457s7.A0J(window, 0);
            Context context = this;
            if (this instanceof ContextWrapper) {
                context = getBaseContext();
            }
            if (window.getStatusBarColor() == AnonymousClass0Y8.A04(context, R.color.f5nameremoved)) {
                AnonymousClass5CQ.A00(window, C86634Kw.A03(this), true);
            }
        }
        if (this.A01.A0X(6581)) {
            C110615gk r1 = (C110615gk) C389229y.A01(this).AcK.A00.A5s.get();
            r1.A00 = getClass();
            AnonymousClass4VG r12 = (AnonymousClass4VG) AnonymousClass4L0.A0F(r1, this).A01(AnonymousClass4VG.class);
            this.A0A = r12;
            if (r12 != null && !(r12 instanceof AnonymousClass57B) && ((AnonymousClass57C) r12).A01) {
                this.A07 = new AnonymousClass6B4(this, 0);
            }
        }
    }

    public C89704el(int i) {
        super(i);
    }

    public void A67(AnonymousClass4FS r1) {
        this.A04 = r1;
    }

    public void A69(boolean z) {
        this.A05 = z;
    }

    public void A6A(boolean z) {
        this.A06 = z;
    }

    public void attachBaseContext(Context context) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("wabaseappcompatactivity/hilt/");
        C18260x0.A1J(A0o, C18310x6.A0n(this));
        BaseEntryPoint baseEntryPoint = (BaseEntryPoint) C389229y.A02(context, C64333Db.class);
        this.A00 = baseEntryPoint.BsW();
        C64333Db r4 = (C64333Db) baseEntryPoint;
        C107695bk r3 = r4.AcK.A00;
        C111365hy AIb = r3.AIb();
        this.A0D = AIb;
        super.attachBaseContext(new C18550xs(context, AIb, this.A00));
        this.A01 = baseEntryPoint.Avy();
        this.A02 = (C56592sF) r4.AWR.get();
        this.A0F = C86614Ku.A0o(r4);
        AnonymousClass316 r1 = this.A00.A01;
        this.A03 = r1.A0D;
        this.A0E = r1.A0C;
        this.A0G = C72343dZ.A00(r3.ACJ);
    }

    public void onPause() {
        super.onPause();
        A4w();
    }

    public void onResume() {
        super.onResume();
        A4v();
    }

    public void onStart() {
        super.onStart();
        if (!this.A0B) {
            if (A6B()) {
                if (this.A01.A0Y(C58422vE.A01, 6327)) {
                    Looper.myQueue().addIdleHandler(new AnonymousClass6B4(this, 1));
                } else {
                    this.A04.BkP(new C70043Zq(this, 15));
                }
            }
            this.A0B = true;
        }
        if (!A6C()) {
            return;
        }
        if (this.A01.A0Y(C58422vE.A01, 6327)) {
            Looper.myQueue().addIdleHandler(new AnonymousClass6B4(this, 2));
        } else {
            this.A04.BkP(new C70043Zq(this, 16));
        }
    }

    public void setSupportActionBar(Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
        this.A08 = toolbar;
        if (toolbar != null && C106545Zk.A04(this.A01, (C58422vE) null, 4864)) {
            toolbar.setPopupTheme(R.style.f12nameremoved);
        }
        A68(this.A0C);
    }

    public void startActivity(Intent intent) {
        C621633u.A03(intent);
        if (this.A01.A0X(5831)) {
            C58552vR r4 = (C58552vR) this.A0G.get();
            String A0O = AnonymousClass000.A0O(this);
            C18260x0.A0O(A0O, intent);
            r4.A00.execute(new C71403c3(r4, intent, A0O, 20));
        }
        super.startActivity(intent);
    }

    public C89704el() {
    }
}
