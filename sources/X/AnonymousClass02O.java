package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.02O  reason: invalid class name */
public class AnonymousClass02O extends MenuInflater {
    public static final Class[] A04;
    public static final Class[] A05;
    public Context A00;
    public Object A01;
    public final Object[] A02;
    public final Object[] A03;

    static {
        Class[] clsArr = {Context.class};
        A05 = clsArr;
        A04 = clsArr;
    }

    public static void A06(Object obj, int i) {
        if (i < 2) {
            return;
        }
        if (obj instanceof C07910d1) {
            C07910d1 r1 = (C07910d1) obj;
            r1.A02 = (r1.A02 & -5) | 4;
        } else if (obj instanceof AnonymousClass04I) {
            ((AnonymousClass04I) obj).A01();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x039c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(android.util.AttributeSet r47, android.view.Menu r48, org.xmlpull.v1.XmlPullParser r49) {
        /*
            r46 = this;
            r1 = 0
            r41 = 0
            r12 = 0
            r40 = 0
            r39 = 0
            r38 = 0
            r2 = 0
            r11 = 0
            r37 = 0
            r36 = 0
            r35 = 0
            r34 = 0
            r33 = 0
            r10 = 0
            r32 = 0
            r9 = 0
            r8 = 0
            r31 = 0
            r30 = 0
            r29 = 0
            r28 = 0
            r27 = 0
            r7 = r1
            r6 = r1
            r5 = 0
            r26 = 0
            r25 = 0
            r24 = 0
            r23 = 1
            r22 = 1
            r44 = r49
            int r3 = r44.getEventType()
        L_0x0038:
            r21 = 2
            java.lang.String r20 = "menu"
            r4 = 1
            r0 = r21
            if (r3 != r0) goto L_0x0488
            java.lang.String r3 = r44.getName()
            r0 = r20
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x04aa
            int r13 = r44.next()
            r43 = r1
            r19 = 0
            r18 = 0
        L_0x0057:
            if (r13 == r4) goto L_0x048e
            java.lang.String r15 = "item"
            java.lang.String r14 = "group"
            r3 = r46
            r16 = r48
            r0 = r21
            if (r13 == r0) goto L_0x0240
            r0 = 3
            if (r13 != r0) goto L_0x007a
            java.lang.String r13 = r44.getName()
            if (r18 == 0) goto L_0x0081
            r0 = r43
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0081
            r43 = r27
            r18 = 0
        L_0x007a:
            int r13 = r44.next()
            if (r19 == 0) goto L_0x0057
            return
        L_0x0081:
            boolean r0 = r13.equals(r14)
            if (r0 == 0) goto L_0x0093
            r5 = 0
            r26 = 0
            r25 = 0
            r24 = 0
            r23 = 1
            r22 = 1
            goto L_0x007a
        L_0x0093:
            boolean r0 = r13.equals(r15)
            if (r0 == 0) goto L_0x0234
            if (r40 != 0) goto L_0x007a
            if (r1 == 0) goto L_0x016f
            r0 = r1
            X.067 r0 = (X.AnonymousClass067) r0
            android.view.ActionProvider r0 = r0.A00
            boolean r0 = r0.hasSubMenu()
            if (r0 == 0) goto L_0x016f
            r40 = 1
            r14 = r33
            r13 = r31
            r0 = r16
            android.view.SubMenu r0 = r0.addSubMenu(r5, r14, r2, r13)
            android.view.MenuItem r13 = r0.getItem()
            r0 = r37
            android.view.MenuItem r14 = r13.setChecked(r0)
            r0 = r28
            android.view.MenuItem r14 = r14.setVisible(r0)
            r0 = r35
            android.view.MenuItem r14 = r14.setEnabled(r0)
            r15 = 0
            r0 = 0
            if (r11 < r4) goto L_0x00cf
            r0 = 1
        L_0x00cf:
            android.view.MenuItem r14 = r14.setCheckable(r0)
            r0 = r30
            android.view.MenuItem r14 = r14.setTitleCondensed(r0)
            r0 = r34
            r14.setIcon(r0)
            if (r8 < 0) goto L_0x00e3
            r13.setShowAsAction(r8)
        L_0x00e3:
            if (r10 == 0) goto L_0x00ff
            android.content.Context r0 = r3.A00
            boolean r14 = r0.isRestricted()
            if (r14 != 0) goto L_0x0495
            java.lang.Object r14 = r3.A01
            if (r14 != 0) goto L_0x00f7
            java.lang.Object r14 = r3.A07(r0)
            r3.A01 = r14
        L_0x00f7:
            X.0a4 r0 = new X.0a4
            r0.<init>(r14, r10)
            r13.setOnMenuItemClickListener(r0)
        L_0x00ff:
            A06(r13, r11)
            if (r41 == 0) goto L_0x013b
            java.lang.Class[] r16 = A05
            java.lang.Object[] r14 = r3.A03
            android.content.Context r0 = r3.A00     // Catch:{ Exception -> 0x0122 }
            java.lang.ClassLoader r3 = r0.getClassLoader()     // Catch:{ Exception -> 0x0122 }
            r0 = r41
            java.lang.Class r3 = java.lang.Class.forName(r0, r15, r3)     // Catch:{ Exception -> 0x0122 }
            r0 = r16
            java.lang.reflect.Constructor r0 = r3.getConstructor(r0)     // Catch:{ Exception -> 0x0122 }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x0122 }
            java.lang.Object r0 = r0.newInstance(r14)     // Catch:{ Exception -> 0x0122 }
            goto L_0x0135
        L_0x0122:
            r14 = move-exception
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "Cannot instantiate class: "
            r0 = r41
            java.lang.String r3 = X.AnonymousClass000.A0V(r3, r0, r15)
            java.lang.String r0 = "SupportMenuInflater"
            android.util.Log.w(r0, r3, r14)
            r0 = 0
        L_0x0135:
            android.view.View r0 = (android.view.View) r0
            r13.setActionView(r0)
            r15 = 1
        L_0x013b:
            if (r12 <= 0) goto L_0x0142
            if (r15 != 0) goto L_0x0167
            r13.setActionView(r12)
        L_0x0142:
            A03(r13, r1)
            r0 = r36
            A04(r13, r0)
            r0 = r29
            A05(r13, r0)
            r3 = r38
            r0 = r39
            A01(r13, r3, r0)
            r0 = r32
            A02(r13, r9, r0)
            if (r6 == 0) goto L_0x0160
            A00(r6, r13)
        L_0x0160:
            if (r7 == 0) goto L_0x007a
            X.AnonymousClass0I5.A00(r7, r13)
            goto L_0x007a
        L_0x0167:
            java.lang.String r3 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
            android.util.Log.w(r3, r0)
            goto L_0x0142
        L_0x016f:
            r40 = 1
            r14 = r33
            r13 = r31
            r0 = r16
            android.view.MenuItem r13 = r0.add(r5, r14, r2, r13)
            r0 = r37
            android.view.MenuItem r14 = r13.setChecked(r0)
            r0 = r28
            android.view.MenuItem r14 = r14.setVisible(r0)
            r0 = r35
            android.view.MenuItem r14 = r14.setEnabled(r0)
            r15 = 0
            r0 = 0
            if (r11 < r4) goto L_0x0192
            r0 = 1
        L_0x0192:
            android.view.MenuItem r14 = r14.setCheckable(r0)
            r0 = r30
            android.view.MenuItem r14 = r14.setTitleCondensed(r0)
            r0 = r34
            r14.setIcon(r0)
            if (r8 < 0) goto L_0x01a6
            r13.setShowAsAction(r8)
        L_0x01a6:
            if (r10 == 0) goto L_0x01c2
            android.content.Context r0 = r3.A00
            boolean r14 = r0.isRestricted()
            if (r14 != 0) goto L_0x049c
            java.lang.Object r14 = r3.A01
            if (r14 != 0) goto L_0x01ba
            java.lang.Object r14 = r3.A07(r0)
            r3.A01 = r14
        L_0x01ba:
            X.0a4 r0 = new X.0a4
            r0.<init>(r14, r10)
            r13.setOnMenuItemClickListener(r0)
        L_0x01c2:
            A06(r13, r11)
            if (r41 == 0) goto L_0x01fe
            java.lang.Class[] r16 = A05
            java.lang.Object[] r14 = r3.A03
            android.content.Context r0 = r3.A00     // Catch:{ Exception -> 0x01e5 }
            java.lang.ClassLoader r3 = r0.getClassLoader()     // Catch:{ Exception -> 0x01e5 }
            r0 = r41
            java.lang.Class r3 = java.lang.Class.forName(r0, r15, r3)     // Catch:{ Exception -> 0x01e5 }
            r0 = r16
            java.lang.reflect.Constructor r0 = r3.getConstructor(r0)     // Catch:{ Exception -> 0x01e5 }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x01e5 }
            java.lang.Object r0 = r0.newInstance(r14)     // Catch:{ Exception -> 0x01e5 }
            goto L_0x01f8
        L_0x01e5:
            r14 = move-exception
            java.lang.StringBuilder r15 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "Cannot instantiate class: "
            r0 = r41
            java.lang.String r3 = X.AnonymousClass000.A0V(r3, r0, r15)
            java.lang.String r0 = "SupportMenuInflater"
            android.util.Log.w(r0, r3, r14)
            r0 = 0
        L_0x01f8:
            android.view.View r0 = (android.view.View) r0
            r13.setActionView(r0)
            r15 = 1
        L_0x01fe:
            if (r12 <= 0) goto L_0x0205
            if (r15 != 0) goto L_0x022c
            r13.setActionView(r12)
        L_0x0205:
            if (r1 == 0) goto L_0x020a
            A03(r13, r1)
        L_0x020a:
            r0 = r36
            A04(r13, r0)
            r0 = r29
            A05(r13, r0)
            r3 = r38
            r0 = r39
            A01(r13, r3, r0)
            r0 = r32
            A02(r13, r9, r0)
            if (r6 == 0) goto L_0x0225
            A00(r6, r13)
        L_0x0225:
            if (r7 == 0) goto L_0x007a
            X.AnonymousClass0I5.A00(r7, r13)
            goto L_0x007a
        L_0x022c:
            java.lang.String r3 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
            android.util.Log.w(r3, r0)
            goto L_0x0205
        L_0x0234:
            r0 = r20
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x007a
            r19 = 1
            goto L_0x007a
        L_0x0240:
            if (r18 != 0) goto L_0x007a
            java.lang.String r13 = r44.getName()
            boolean r0 = r13.equals(r14)
            r45 = r47
            if (r0 == 0) goto L_0x027b
            android.content.Context r5 = r3.A00
            int[] r3 = X.AnonymousClass0KC.A0E
            r0 = r45
            android.content.res.TypedArray r13 = r5.obtainStyledAttributes(r0, r3)
            r3 = 0
            int r5 = r13.getResourceId(r4, r3)
            r0 = 3
            int r26 = r13.getInt(r0, r3)
            r0 = 4
            int r25 = r13.getInt(r0, r3)
            r0 = 5
            int r24 = r13.getInt(r0, r3)
            r0 = r21
            boolean r23 = r13.getBoolean(r0, r4)
            boolean r22 = r13.getBoolean(r3, r4)
            r13.recycle()
            goto L_0x007a
        L_0x027b:
            boolean r0 = r13.equals(r15)
            if (r0 == 0) goto L_0x039f
            android.content.Context r1 = r3.A00
            int[] r2 = X.AnonymousClass0KC.A0F
            r0 = r45
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r0, r2)
            X.0UD r7 = new X.0UD
            r7.<init>(r1, r0)
            r14 = 0
            android.content.res.TypedArray r13 = r7.A02
            r0 = r21
            int r33 = r13.getResourceId(r0, r14)
            r2 = 5
            r0 = r26
            int r2 = r13.getInt(r2, r0)
            r8 = 6
            r0 = r25
            int r8 = r13.getInt(r8, r0)
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r0
            r0 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 & r0
            r2 = r2 | r8
            r0 = 7
            java.lang.CharSequence r31 = r13.getText(r0)
            r0 = 8
            java.lang.CharSequence r30 = r13.getText(r0)
            int r34 = r13.getResourceId(r14, r14)
            r0 = 9
            java.lang.String r0 = r13.getString(r0)
            if (r0 != 0) goto L_0x0331
            r38 = 0
        L_0x02c8:
            r0 = 16
            r8 = 4096(0x1000, float:5.74E-42)
            int r39 = r13.getInt(r0, r8)
            r0 = 10
            java.lang.String r0 = r13.getString(r0)
            if (r0 != 0) goto L_0x032c
            r9 = 0
        L_0x02d9:
            r0 = 20
            int r32 = r13.getInt(r0, r8)
            r0 = 11
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L_0x0329
            r0 = 11
            boolean r11 = r13.getBoolean(r0, r14)
        L_0x02ed:
            r0 = 3
            boolean r37 = r13.getBoolean(r0, r14)
            r8 = 4
            r0 = r23
            boolean r28 = r13.getBoolean(r8, r0)
            r0 = r22
            boolean r35 = r13.getBoolean(r4, r0)
            r8 = 21
            r0 = -1
            int r8 = r13.getInt(r8, r0)
            r0 = 12
            java.lang.String r10 = r13.getString(r0)
            r0 = 13
            int r12 = r13.getResourceId(r0, r14)
            r0 = 15
            java.lang.String r41 = r13.getString(r0)
            r0 = 14
            java.lang.String r15 = r13.getString(r0)
            if (r15 == 0) goto L_0x0365
            if (r12 != 0) goto L_0x035e
            if (r41 != 0) goto L_0x035e
            java.lang.Class[] r0 = A04
            java.lang.Object[] r3 = r3.A02
            goto L_0x0336
        L_0x0329:
            r11 = r24
            goto L_0x02ed
        L_0x032c:
            char r9 = r0.charAt(r14)
            goto L_0x02d9
        L_0x0331:
            char r38 = r0.charAt(r14)
            goto L_0x02c8
        L_0x0336:
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x034a }
            java.lang.Class r1 = java.lang.Class.forName(r15, r14, r1)     // Catch:{ Exception -> 0x034a }
            java.lang.reflect.Constructor r0 = r1.getConstructor(r0)     // Catch:{ Exception -> 0x034a }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x034a }
            java.lang.Object r1 = r0.newInstance(r3)     // Catch:{ Exception -> 0x034a }
            goto L_0x035b
        L_0x034a:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Cannot instantiate class: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r15, r1)
            java.lang.String r0 = "SupportMenuInflater"
            android.util.Log.w(r0, r1, r3)
            r1 = 0
        L_0x035b:
            X.0L5 r1 = (X.AnonymousClass0L5) r1
            goto L_0x0367
        L_0x035e:
            java.lang.String r1 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r1, r0)
        L_0x0365:
            r1 = r27
        L_0x0367:
            r0 = 17
            java.lang.CharSequence r36 = r13.getText(r0)
            r0 = 22
            java.lang.CharSequence r29 = r13.getText(r0)
            r0 = 19
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L_0x039c
            r3 = 19
            r0 = -1
            int r0 = r13.getInt(r3, r0)
            android.graphics.PorterDuff$Mode r6 = X.AnonymousClass0XA.A00(r6, r0)
        L_0x0386:
            r3 = 18
            boolean r0 = r13.hasValue(r3)
            if (r0 == 0) goto L_0x0399
            android.content.res.ColorStateList r7 = r7.A01(r3)
        L_0x0392:
            r13.recycle()
            r40 = 0
            goto L_0x007a
        L_0x0399:
            r7 = r27
            goto L_0x0392
        L_0x039c:
            r6 = r27
            goto L_0x0386
        L_0x039f:
            r0 = r20
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0482
            r40 = 1
            r14 = r33
            r13 = r31
            r0 = r16
            android.view.SubMenu r17 = r0.addSubMenu(r5, r14, r2, r13)
            android.view.MenuItem r13 = r17.getItem()
            r0 = r37
            android.view.MenuItem r14 = r13.setChecked(r0)
            r0 = r28
            android.view.MenuItem r14 = r14.setVisible(r0)
            r0 = r35
            android.view.MenuItem r14 = r14.setEnabled(r0)
            r16 = 0
            r0 = 0
            if (r11 < r4) goto L_0x03cf
            r0 = 1
        L_0x03cf:
            android.view.MenuItem r14 = r14.setCheckable(r0)
            r0 = r30
            android.view.MenuItem r14 = r14.setTitleCondensed(r0)
            r0 = r34
            r14.setIcon(r0)
            if (r8 < 0) goto L_0x03e3
            r13.setShowAsAction(r8)
        L_0x03e3:
            if (r10 == 0) goto L_0x03ff
            android.content.Context r15 = r3.A00
            boolean r0 = r15.isRestricted()
            if (r0 != 0) goto L_0x04a3
            java.lang.Object r14 = r3.A01
            if (r14 != 0) goto L_0x03f7
            java.lang.Object r14 = r3.A07(r15)
            r3.A01 = r14
        L_0x03f7:
            X.0a4 r0 = new X.0a4
            r0.<init>(r14, r10)
            r13.setOnMenuItemClickListener(r0)
        L_0x03ff:
            A06(r13, r11)
            if (r41 == 0) goto L_0x0443
            java.lang.Class[] r16 = A05
            java.lang.Object[] r0 = r3.A03
            r42 = r0
            android.content.Context r0 = r3.A00     // Catch:{ Exception -> 0x0427 }
            java.lang.ClassLoader r14 = r0.getClassLoader()     // Catch:{ Exception -> 0x0427 }
            r0 = 0
            r15 = r41
            java.lang.Class r14 = java.lang.Class.forName(r15, r0, r14)     // Catch:{ Exception -> 0x0427 }
            r0 = r16
            java.lang.reflect.Constructor r14 = r14.getConstructor(r0)     // Catch:{ Exception -> 0x0427 }
            r14.setAccessible(r4)     // Catch:{ Exception -> 0x0427 }
            r0 = r42
            java.lang.Object r0 = r14.newInstance(r0)     // Catch:{ Exception -> 0x0427 }
            goto L_0x043c
        L_0x0427:
            r16 = move-exception
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Cannot instantiate class: "
            r15 = r41
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r15, r14)
            java.lang.String r15 = "SupportMenuInflater"
            r14 = r16
            android.util.Log.w(r15, r0, r14)
            r0 = 0
        L_0x043c:
            android.view.View r0 = (android.view.View) r0
            r13.setActionView(r0)
            r16 = 1
        L_0x0443:
            if (r12 <= 0) goto L_0x044a
            if (r16 != 0) goto L_0x047a
            r13.setActionView(r12)
        L_0x044a:
            if (r1 == 0) goto L_0x044f
            A03(r13, r1)
        L_0x044f:
            r0 = r36
            A04(r13, r0)
            r0 = r29
            A05(r13, r0)
            r14 = r38
            r0 = r39
            A01(r13, r14, r0)
            r0 = r32
            A02(r13, r9, r0)
            if (r6 == 0) goto L_0x046a
            A00(r6, r13)
        L_0x046a:
            if (r7 == 0) goto L_0x046f
            X.AnonymousClass0I5.A00(r7, r13)
        L_0x046f:
            r14 = r17
            r13 = r44
            r0 = r45
            r3.A08(r0, r14, r13)
            goto L_0x007a
        L_0x047a:
            java.lang.String r14 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
            android.util.Log.w(r14, r0)
            goto L_0x044a
        L_0x0482:
            r43 = r13
            r18 = 1
            goto L_0x007a
        L_0x0488:
            int r3 = r44.next()
            if (r3 != r4) goto L_0x0038
        L_0x048e:
            java.lang.String r0 = "Unexpected end of document"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x0495:
            java.lang.String r0 = "The android:onClick attribute cannot be used within a restricted context"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x049c:
            java.lang.String r0 = "The android:onClick attribute cannot be used within a restricted context"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x04a3:
            java.lang.String r0 = "The android:onClick attribute cannot be used within a restricted context"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x04aa:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Expecting menu, got "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r3, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02O.A08(android.util.AttributeSet, android.view.Menu, org.xmlpull.v1.XmlPullParser):void");
    }

    public static void A00(PorterDuff.Mode mode, MenuItem menuItem) {
        if (menuItem instanceof C17230vB) {
            ((C17230vB) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C06470Xv.A02(mode, menuItem);
        }
    }

    public static void A01(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C17230vB) {
            ((C17230vB) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C06470Xv.A03(menuItem, c, i);
        }
    }

    public static void A02(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C17230vB) {
            ((C17230vB) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C06470Xv.A04(menuItem, c, i);
        }
    }

    public static void A03(MenuItem menuItem, AnonymousClass0L5 r2) {
        if (menuItem instanceof C17230vB) {
            ((C17230vB) menuItem).BnW(r2);
        } else {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        }
    }

    public static void A04(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C17230vB) {
            ((C17230vB) menuItem).Bm0(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C06470Xv.A05(menuItem, charSequence);
        }
    }

    public static void A05(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C17230vB) {
            ((C17230vB) menuItem).Bna(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C06470Xv.A06(menuItem, charSequence);
        }
    }

    public final Object A07(Object obj) {
        if ((obj instanceof Activity) || !(obj instanceof ContextWrapper)) {
            return obj;
        }
        return A07(((ContextWrapper) obj).getBaseContext());
    }

    public void inflate(int i, Menu menu) {
        InflateException inflateException;
        if (!(menu instanceof C17220vA)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser layout = this.A00.getResources().getLayout(i);
            A08(Xml.asAttributeSet(layout), menu, layout);
            if (layout != null) {
                layout.close();
                return;
            }
            return;
        } catch (XmlPullParserException e) {
            inflateException = new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            inflateException = new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
        throw inflateException;
    }

    public AnonymousClass02O(Context context) {
        super(context);
        this.A00 = context;
        Object[] A1b = AnonymousClass000.A1b(context);
        this.A03 = A1b;
        this.A02 = A1b;
    }
}
