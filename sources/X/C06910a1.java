package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.0a1  reason: invalid class name and case insensitive filesystem */
public class C06910a1 implements LayoutInflater.Factory2 {
    public final C08270df A00;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        if (r4 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        if (r8 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (r7 == -1) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        r8 = r11.A00.A0B(r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0014
            X.0df r1 = r11.A00
            androidx.fragment.app.FragmentContainerView r0 = new androidx.fragment.app.FragmentContainerView
            r0.<init>((android.content.Context) r14, (android.util.AttributeSet) r15, (X.C08270df) r1)
            return r0
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r0 = r0.equals(r13)
            r8 = 0
            if (r0 != 0) goto L_0x001e
            return r8
        L_0x001e:
            java.lang.String r0 = "class"
            java.lang.String r2 = r15.getAttributeValue(r8, r0)
            int[] r0 = X.C03370Jw.A00
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r15, r0)
            if (r2 != 0) goto L_0x0031
            r0 = 0
            java.lang.String r2 = r1.getString(r0)
        L_0x0031:
            r0 = 1
            r3 = -1
            int r5 = r1.getResourceId(r0, r3)
            r0 = 2
            java.lang.String r4 = r1.getString(r0)
            r1.recycle()
            if (r2 == 0) goto L_0x0199
            java.lang.ClassLoader r7 = r14.getClassLoader()
            X.0Wz r0 = X.C05930Vn.A01     // Catch:{ ClassNotFoundException -> 0x006e }
            java.lang.Object r6 = r0.get(r7)     // Catch:{ ClassNotFoundException -> 0x006e }
            X.0Wz r6 = (X.C06290Wz) r6     // Catch:{ ClassNotFoundException -> 0x006e }
            if (r6 != 0) goto L_0x0057
            X.0Wz r6 = new X.0Wz     // Catch:{ ClassNotFoundException -> 0x006e }
            r6.<init>()     // Catch:{ ClassNotFoundException -> 0x006e }
            r0.put(r7, r6)     // Catch:{ ClassNotFoundException -> 0x006e }
        L_0x0057:
            java.lang.Object r1 = r6.get(r2)     // Catch:{ ClassNotFoundException -> 0x006e }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ ClassNotFoundException -> 0x006e }
            if (r1 != 0) goto L_0x0067
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r7)     // Catch:{ ClassNotFoundException -> 0x006e }
            r6.put(r2, r1)     // Catch:{ ClassNotFoundException -> 0x006e }
        L_0x0067:
            java.lang.Class<X.0eF> r0 = X.C08310eF.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x006e }
            goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            if (r0 == 0) goto L_0x0199
            if (r12 == 0) goto L_0x008b
            int r7 = r12.getId()
            if (r7 != r3) goto L_0x008c
            if (r5 != r3) goto L_0x008c
            if (r4 != 0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0i(r15)
            java.lang.String r0 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r2, r1)
            throw r0
        L_0x008b:
            r7 = 0
        L_0x008c:
            if (r5 == r3) goto L_0x0096
            X.0df r0 = r11.A00
            X.0eF r8 = r0.A0B(r5)
            if (r8 != 0) goto L_0x00a8
        L_0x0096:
            if (r4 == 0) goto L_0x00a0
        L_0x0098:
            X.0df r0 = r11.A00
            X.0eF r8 = r0.A0D(r4)
            if (r8 != 0) goto L_0x00a8
        L_0x00a0:
            if (r7 == r3) goto L_0x00a8
            X.0df r0 = r11.A00
            X.0eF r8 = r0.A0B(r7)
        L_0x00a8:
            java.lang.String r6 = "Fragment "
            java.lang.String r3 = "FragmentManager"
            r10 = 2
            r9 = 1
            if (r8 != 0) goto L_0x013d
            X.0df r1 = r11.A00
            X.0Vn r0 = r1.A0E()
            r14.getClassLoader()
            X.0eF r8 = r0.A00(r2)
            r8.A0a = r9
            r0 = r7
            if (r5 == 0) goto L_0x00c3
            r0 = r5
        L_0x00c3:
            r8.A03 = r0
            r8.A01 = r7
            r8.A0T = r4
            r8.A0e = r9
            r8.A0I = r1
            X.07u r0 = r1.A07
            r8.A0G = r0
            r8.A0X = r9
            if (r0 == 0) goto L_0x00da
            r0 = 0
            r8.A0X = r0
            r8.A0X = r9
        L_0x00da:
            X.0WE r7 = r1.A0F(r8)
            boolean r0 = X.C08270df.A05(r10)
            if (r0 == 0) goto L_0x00f4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r8, r6)
            java.lang.String r0 = " has been inflated via the <fragment> tag: id=0x"
        L_0x00ea:
            X.AnonymousClass000.A1G(r0, r1, r5)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r3, r0)
        L_0x00f4:
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            X.084 r10 = new X.084
            r10.<init>(r12, r8)
            X.0Y2 r9 = X.AnonymousClass0Y2.A01
            X.AnonymousClass0Y2.A03(r10)
            X.0T5 r3 = X.AnonymousClass0Y2.A00(r8)
            java.util.Set r1 = r3.A01
            X.0G2 r0 = X.AnonymousClass0G2.DETECT_FRAGMENT_TAG_USAGE
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0111
            X.AnonymousClass000.A0y(r3, r9, r10, r8)
        L_0x0111:
            r8.A0C = r12
            r7.A04()
            r7.A03()
            android.view.View r0 = r8.A0B
            if (r0 == 0) goto L_0x016e
            if (r5 == 0) goto L_0x0122
            r0.setId(r5)
        L_0x0122:
            android.view.View r0 = r8.A0B
            java.lang.Object r0 = r0.getTag()
            if (r0 != 0) goto L_0x012f
            android.view.View r0 = r8.A0B
            r0.setTag(r4)
        L_0x012f:
            android.view.View r2 = r8.A0B
            r1 = 0
            X.0wA r0 = new X.0wA
            r0.<init>(r7, r1, r11)
            r2.addOnAttachStateChangeListener(r0)
            android.view.View r0 = r8.A0B
            return r0
        L_0x013d:
            boolean r0 = r8.A0e
            if (r0 != 0) goto L_0x0179
            r8.A0e = r9
            X.0df r1 = r11.A00
            r8.A0I = r1
            X.07u r0 = r1.A07
            r8.A0G = r0
            r8.A0X = r9
            if (r0 == 0) goto L_0x0154
            r0 = 0
            r8.A0X = r0
            r8.A0X = r9
        L_0x0154:
            X.0WE r7 = r1.A0G(r8)
            boolean r0 = X.C08270df.A05(r10)
            if (r0 == 0) goto L_0x00f4
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Retained Fragment "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " has been re-attached via the <fragment> tag: id=0x"
            goto L_0x00ea
        L_0x016e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r6, r2)
            java.lang.String r0 = " did not create a view."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        L_0x0179:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0i(r15)
            java.lang.String r0 = ": Duplicate id 0x"
            X.AnonymousClass000.A1G(r0, r1, r5)
            java.lang.String r0 = ", tag "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", or parent id 0x"
            X.AnonymousClass000.A1G(r0, r1, r7)
            java.lang.String r0 = " with another fragment for "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r2, r1)
            throw r0
        L_0x0199:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06910a1.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public C06910a1(C08270df r1) {
        this.A00 = r1;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
