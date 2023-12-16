package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.0XW  reason: invalid class name */
public final class AnonymousClass0XW {
    public static AnonymousClass0XW A07;
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public static final AnonymousClass05B A09 = new AnonymousClass05B();
    public TypedValue A00;
    public C14530pq A01;
    public C06290Wz A02;
    public C10530i5 A03;
    public WeakHashMap A04;
    public boolean A05;
    public final WeakHashMap A06 = new WeakHashMap(0);

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList A05(android.content.Context r9, int r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.WeakHashMap r0 = r8.A04     // Catch:{ all -> 0x011c }
            r3 = 0
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x011c }
            X.0i5 r0 = (X.C10530i5) r0     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x0014
            java.lang.Object r3 = r0.A01(r10, r3)     // Catch:{ all -> 0x011c }
            android.content.res.ColorStateList r3 = (android.content.res.ColorStateList) r3     // Catch:{ all -> 0x011c }
        L_0x0014:
            if (r3 != 0) goto L_0x011a
            X.0pq r2 = r8.A01     // Catch:{ all -> 0x011c }
            if (r2 == 0) goto L_0x00f7
            X.0bM r2 = (X.C07640bM) r2     // Catch:{ all -> 0x011c }
            r0 = 2131230892(0x7f0800ac, float:1.807785E38)
            r1 = 2131099669(0x7f060015, float:1.7811698E38)
            if (r10 == r0) goto L_0x00f2
            r0 = 2131230938(0x7f0800da, float:1.8077943E38)
            r1 = 2131099672(0x7f060018, float:1.7811704E38)
            if (r10 == r0) goto L_0x00f2
            r0 = 2131230937(0x7f0800d9, float:1.807794E38)
            if (r10 != r0) goto L_0x0090
            r0 = 3
            int[][] r2 = new int[r0][]     // Catch:{ all -> 0x011c }
            int[] r1 = new int[r0]     // Catch:{ all -> 0x011c }
            r6 = 2130969038(0x7f0401ce, float:1.7546747E38)
            android.content.res.ColorStateList r5 = X.AnonymousClass0XB.A02(r9, r6)     // Catch:{ all -> 0x011c }
            r7 = 2
            r4 = 1
            r3 = 0
            if (r5 == 0) goto L_0x0070
            boolean r0 = r5.isStateful()     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x0070
            int[] r0 = X.AnonymousClass0XB.A02     // Catch:{ all -> 0x011c }
            r2[r3] = r0     // Catch:{ all -> 0x011c }
            int r0 = r5.getColorForState(r0, r3)     // Catch:{ all -> 0x011c }
            r1[r3] = r0     // Catch:{ all -> 0x011c }
            int[] r0 = X.AnonymousClass0XB.A01     // Catch:{ all -> 0x011c }
            r2[r4] = r0     // Catch:{ all -> 0x011c }
            r0 = 2130968995(0x7f0401a3, float:1.754666E38)
            int r0 = X.AnonymousClass0XB.A01(r9, r0)     // Catch:{ all -> 0x011c }
            r1[r4] = r0     // Catch:{ all -> 0x011c }
            int[] r0 = X.AnonymousClass0XB.A03     // Catch:{ all -> 0x011c }
            r2[r7] = r0     // Catch:{ all -> 0x011c }
            int r0 = r5.getDefaultColor()     // Catch:{ all -> 0x011c }
        L_0x0067:
            r1[r7] = r0     // Catch:{ all -> 0x011c }
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList     // Catch:{ all -> 0x011c }
            r3.<init>(r2, r1)     // Catch:{ all -> 0x011c }
            goto L_0x00f8
        L_0x0070:
            int[] r0 = X.AnonymousClass0XB.A02     // Catch:{ all -> 0x011c }
            r2[r3] = r0     // Catch:{ all -> 0x011c }
            int r0 = X.AnonymousClass0XB.A00(r9, r6)     // Catch:{ all -> 0x011c }
            r1[r3] = r0     // Catch:{ all -> 0x011c }
            int[] r0 = X.AnonymousClass0XB.A01     // Catch:{ all -> 0x011c }
            r2[r4] = r0     // Catch:{ all -> 0x011c }
            r0 = 2130968995(0x7f0401a3, float:1.754666E38)
            int r0 = X.AnonymousClass0XB.A01(r9, r0)     // Catch:{ all -> 0x011c }
            r1[r4] = r0     // Catch:{ all -> 0x011c }
            int[] r0 = X.AnonymousClass0XB.A03     // Catch:{ all -> 0x011c }
            r2[r7] = r0     // Catch:{ all -> 0x011c }
            int r0 = X.AnonymousClass0XB.A01(r9, r6)     // Catch:{ all -> 0x011c }
            goto L_0x0067
        L_0x0090:
            r0 = 2131230880(0x7f0800a0, float:1.8077825E38)
            r1 = 2130968992(0x7f0401a0, float:1.7546653E38)
            if (r10 == r0) goto L_0x00e9
            r0 = 2131230874(0x7f08009a, float:1.8077813E38)
            if (r10 != r0) goto L_0x00a3
            r0 = 0
            android.content.res.ColorStateList r3 = X.C07640bM.A00(r9, r0)     // Catch:{ all -> 0x011c }
            goto L_0x00f8
        L_0x00a3:
            r0 = 2131230879(0x7f08009f, float:1.8077823E38)
            r1 = 2130968990(0x7f04019e, float:1.754665E38)
            if (r10 == r0) goto L_0x00e9
            r0 = 2131230933(0x7f0800d5, float:1.8077933E38)
            if (r10 == r0) goto L_0x00e5
            r0 = 2131230934(0x7f0800d6, float:1.8077935E38)
            if (r10 == r0) goto L_0x00e5
            int[] r0 = r2.A04     // Catch:{ all -> 0x011c }
            boolean r0 = X.C07640bM.A02(r0, r10)     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x00c5
            r0 = 2130968997(0x7f0401a5, float:1.7546663E38)
            android.content.res.ColorStateList r3 = X.AnonymousClass0XB.A02(r9, r0)     // Catch:{ all -> 0x011c }
            goto L_0x00f8
        L_0x00c5:
            int[] r0 = r2.A05     // Catch:{ all -> 0x011c }
            boolean r0 = X.C07640bM.A02(r0, r10)     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x00d1
            r1 = 2131099668(0x7f060014, float:1.7811696E38)
            goto L_0x00f2
        L_0x00d1:
            int[] r0 = r2.A03     // Catch:{ all -> 0x011c }
            boolean r0 = X.C07640bM.A02(r0, r10)     // Catch:{ all -> 0x011c }
            r1 = 2131099667(0x7f060013, float:1.7811694E38)
            if (r0 != 0) goto L_0x00f2
            r0 = 2131230930(0x7f0800d2, float:1.8077927E38)
            if (r10 != r0) goto L_0x00f7
            r1 = 2131099670(0x7f060016, float:1.78117E38)
            goto L_0x00f2
        L_0x00e5:
            r1 = 2131099671(0x7f060017, float:1.7811702E38)
            goto L_0x00f2
        L_0x00e9:
            int r0 = X.AnonymousClass0XB.A01(r9, r1)     // Catch:{ all -> 0x011c }
            android.content.res.ColorStateList r3 = X.C07640bM.A00(r9, r0)     // Catch:{ all -> 0x011c }
            goto L_0x00f8
        L_0x00f2:
            android.content.res.ColorStateList r3 = X.AnonymousClass0VX.A00(r9, r1)     // Catch:{ all -> 0x011c }
            goto L_0x00f8
        L_0x00f7:
            r3 = 0
        L_0x00f8:
            if (r3 == 0) goto L_0x011a
            java.util.WeakHashMap r0 = r8.A04     // Catch:{ all -> 0x011c }
            if (r0 != 0) goto L_0x0105
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x011c }
            r0.<init>()     // Catch:{ all -> 0x011c }
            r8.A04 = r0     // Catch:{ all -> 0x011c }
        L_0x0105:
            java.lang.Object r1 = r0.get(r9)     // Catch:{ all -> 0x011c }
            X.0i5 r1 = (X.C10530i5) r1     // Catch:{ all -> 0x011c }
            if (r1 != 0) goto L_0x0117
            X.0i5 r1 = new X.0i5     // Catch:{ all -> 0x011c }
            r1.<init>()     // Catch:{ all -> 0x011c }
            java.util.WeakHashMap r0 = r8.A04     // Catch:{ all -> 0x011c }
            r0.put(r9, r1)     // Catch:{ all -> 0x011c }
        L_0x0117:
            r1.A02(r10, r3)     // Catch:{ all -> 0x011c }
        L_0x011a:
            monitor-exit(r8)
            return r3
        L_0x011c:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XW.A05(android.content.Context, int):android.content.res.ColorStateList");
    }

    public synchronized Drawable A06(Context context, int i) {
        return A07(context, i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x025d, code lost:
        if (r12 == com.whatsapp.R.drawable.abc_dialog_material_background) goto L_0x025f;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0278 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0289 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0094 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba A[Catch:{ Exception -> 0x00c2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable A07(android.content.Context r11, int r12, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.A05     // Catch:{ all -> 0x02f8 }
            if (r0 != 0) goto L_0x0021
            r0 = 1
            r10.A05 = r0     // Catch:{ all -> 0x02f8 }
            r0 = 2131230950(0x7f0800e6, float:1.8077967E38)
            android.graphics.drawable.Drawable r1 = r10.A06(r11, r0)     // Catch:{ all -> 0x02f8 }
            if (r1 == 0) goto L_0x02ee
            boolean r0 = r1 instanceof X.AnonymousClass0AQ     // Catch:{ all -> 0x02f8 }
            if (r0 != 0) goto L_0x0021
            java.lang.String r1 = X.AnonymousClass000.A0O(r1)     // Catch:{ all -> 0x02f8 }
            java.lang.String r0 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x02ee
        L_0x0021:
            X.0Wz r2 = r10.A02     // Catch:{ all -> 0x02f8 }
            r4 = 0
            if (r2 == 0) goto L_0x00d1
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x02f8 }
            if (r0 != 0) goto L_0x00d1
            X.0i5 r0 = r10.A03     // Catch:{ all -> 0x02f8 }
            java.lang.String r5 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0046
            java.lang.Object r1 = r0.A01(r12, r4)     // Catch:{ all -> 0x02f8 }
            boolean r0 = r5.equals(r1)     // Catch:{ all -> 0x02f8 }
            if (r0 != 0) goto L_0x00d1
            if (r1 == 0) goto L_0x004d
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x02f8 }
            if (r0 != 0) goto L_0x004d
            goto L_0x00d1
        L_0x0046:
            X.0i5 r0 = new X.0i5     // Catch:{ all -> 0x02f8 }
            r0.<init>()     // Catch:{ all -> 0x02f8 }
            r10.A03 = r0     // Catch:{ all -> 0x02f8 }
        L_0x004d:
            android.util.TypedValue r6 = r10.A00     // Catch:{ all -> 0x02f8 }
            if (r6 != 0) goto L_0x0058
            android.util.TypedValue r6 = new android.util.TypedValue     // Catch:{ all -> 0x02f8 }
            r6.<init>()     // Catch:{ all -> 0x02f8 }
            r10.A00 = r6     // Catch:{ all -> 0x02f8 }
        L_0x0058:
            android.content.res.Resources r7 = r11.getResources()     // Catch:{ all -> 0x02f8 }
            r9 = 1
            r7.getValue(r12, r6, r9)     // Catch:{ all -> 0x02f8 }
            int r0 = r6.assetCookie     // Catch:{ all -> 0x02f8 }
            long r0 = (long) r0     // Catch:{ all -> 0x02f8 }
            r2 = 32
            long r0 = r0 << r2
            int r2 = r6.data     // Catch:{ all -> 0x02f8 }
            long r2 = (long) r2     // Catch:{ all -> 0x02f8 }
            long r0 = r0 | r2
            android.graphics.drawable.Drawable r4 = r10.A08(r11, r0)     // Catch:{ all -> 0x02f8 }
            if (r4 != 0) goto L_0x00d1
            java.lang.CharSequence r2 = r6.string     // Catch:{ all -> 0x02f8 }
            if (r2 == 0) goto L_0x00ca
            java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x02f8 }
            java.lang.String r2 = ".xml"
            boolean r2 = r3.endsWith(r2)     // Catch:{ all -> 0x02f8 }
            if (r2 == 0) goto L_0x00ca
            android.content.res.XmlResourceParser r8 = r7.getXml(r12)     // Catch:{ Exception -> 0x00c2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r8)     // Catch:{ Exception -> 0x00c2 }
        L_0x0088:
            int r3 = r8.next()     // Catch:{ Exception -> 0x00c2 }
            r2 = 2
            if (r3 == r2) goto L_0x0092
            if (r3 == r9) goto L_0x0092
            goto L_0x0088
        L_0x0092:
            if (r3 != r2) goto L_0x00ba
            java.lang.String r3 = r8.getName()     // Catch:{ Exception -> 0x00c2 }
            X.0i5 r2 = r10.A03     // Catch:{ Exception -> 0x00c2 }
            r2.A02(r12, r3)     // Catch:{ Exception -> 0x00c2 }
            X.0Wz r2 = r10.A02     // Catch:{ Exception -> 0x00c2 }
            java.lang.Object r3 = r2.get(r3)     // Catch:{ Exception -> 0x00c2 }
            X.0rd r3 = (X.C15600rd) r3     // Catch:{ Exception -> 0x00c2 }
            if (r3 == 0) goto L_0x00af
            android.content.res.Resources$Theme r2 = r11.getTheme()     // Catch:{ Exception -> 0x00c2 }
            android.graphics.drawable.Drawable r4 = r3.B0g(r11, r2, r7, r8)     // Catch:{ Exception -> 0x00c2 }
        L_0x00af:
            if (r4 == 0) goto L_0x00ca
            int r2 = r6.changingConfigurations     // Catch:{ Exception -> 0x00c2 }
            r4.setChangingConfigurations(r2)     // Catch:{ Exception -> 0x00c2 }
            r10.A09(r11, r4, r0)     // Catch:{ Exception -> 0x00c2 }
            goto L_0x00ca
        L_0x00ba:
            java.lang.String r1 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00c2 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00c2 }
            throw r0     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            r2 = move-exception
            java.lang.String r1 = "ResourceManagerInternal"
            java.lang.String r0 = "Exception while inflating drawable"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x02f8 }
        L_0x00ca:
            if (r4 != 0) goto L_0x00d1
            X.0i5 r0 = r10.A03     // Catch:{ all -> 0x02f8 }
            r0.A02(r12, r5)     // Catch:{ all -> 0x02f8 }
        L_0x00d1:
            if (r4 != 0) goto L_0x01dd
            android.util.TypedValue r5 = r10.A00     // Catch:{ all -> 0x02f8 }
            if (r5 != 0) goto L_0x00de
            android.util.TypedValue r5 = new android.util.TypedValue     // Catch:{ all -> 0x02f8 }
            r5.<init>()     // Catch:{ all -> 0x02f8 }
            r10.A00 = r5     // Catch:{ all -> 0x02f8 }
        L_0x00de:
            android.content.res.Resources r1 = r11.getResources()     // Catch:{ all -> 0x02f8 }
            r0 = 1
            r1.getValue(r12, r5, r0)     // Catch:{ all -> 0x02f8 }
            int r0 = r5.assetCookie     // Catch:{ all -> 0x02f8 }
            long r0 = (long) r0     // Catch:{ all -> 0x02f8 }
            r2 = 32
            long r0 = r0 << r2
            int r2 = r5.data     // Catch:{ all -> 0x02f8 }
            long r2 = (long) r2     // Catch:{ all -> 0x02f8 }
            long r0 = r0 | r2
            android.graphics.drawable.Drawable r4 = r10.A08(r11, r0)     // Catch:{ all -> 0x02f8 }
            if (r4 != 0) goto L_0x01dd
            X.0pq r2 = r10.A01     // Catch:{ all -> 0x02f8 }
            if (r2 != 0) goto L_0x00fc
            goto L_0x01dc
        L_0x00fc:
            r2 = 2131230888(0x7f0800a8, float:1.8077841E38)
            if (r12 != r2) goto L_0x011f
            r2 = 2
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r2]     // Catch:{ all -> 0x02f8 }
            r2 = 2131230887(0x7f0800a7, float:1.807784E38)
            android.graphics.drawable.Drawable r3 = r10.A06(r11, r2)     // Catch:{ all -> 0x02f8 }
            r2 = 0
            r6[r2] = r3     // Catch:{ all -> 0x02f8 }
            r2 = 2131230889(0x7f0800a9, float:1.8077844E38)
            android.graphics.drawable.Drawable r3 = r10.A06(r11, r2)     // Catch:{ all -> 0x02f8 }
            r2 = 1
            r6[r2] = r3     // Catch:{ all -> 0x02f8 }
            android.graphics.drawable.LayerDrawable r4 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x02f8 }
            r4.<init>(r6)     // Catch:{ all -> 0x02f8 }
            goto L_0x01d1
        L_0x011f:
            r2 = 2131230923(0x7f0800cb, float:1.8077912E38)
            if (r12 != r2) goto L_0x0128
            r3 = 2131165243(0x7f07003b, float:1.7944698E38)
            goto L_0x0139
        L_0x0128:
            r2 = 2131230922(0x7f0800ca, float:1.807791E38)
            if (r12 != r2) goto L_0x0131
            r3 = 2131165244(0x7f07003c, float:1.79447E38)
            goto L_0x0139
        L_0x0131:
            r2 = 2131230924(0x7f0800cc, float:1.8077915E38)
            if (r12 != r2) goto L_0x01d0
            r3 = 2131165245(0x7f07003d, float:1.7944702E38)
        L_0x0139:
            android.content.res.Resources r2 = r11.getResources()     // Catch:{ all -> 0x02f8 }
            int r8 = r2.getDimensionPixelSize(r3)     // Catch:{ all -> 0x02f8 }
            r2 = 2131230935(0x7f0800d7, float:1.8077937E38)
            android.graphics.drawable.Drawable r7 = r10.A06(r11, r2)     // Catch:{ all -> 0x02f8 }
            r2 = 2131230936(0x7f0800d8, float:1.8077939E38)
            android.graphics.drawable.Drawable r4 = r10.A06(r11, r2)     // Catch:{ all -> 0x02f8 }
            boolean r2 = r7 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x02f8 }
            r6 = 0
            if (r2 == 0) goto L_0x01b9
            int r2 = r7.getIntrinsicWidth()     // Catch:{ all -> 0x02f8 }
            if (r2 != r8) goto L_0x01b9
            int r2 = r7.getIntrinsicHeight()     // Catch:{ all -> 0x02f8 }
            if (r2 != r8) goto L_0x01b9
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7     // Catch:{ all -> 0x02f8 }
            android.graphics.Bitmap r3 = r7.getBitmap()     // Catch:{ all -> 0x02f8 }
        L_0x0166:
            android.graphics.drawable.BitmapDrawable r9 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x02f8 }
            r9.<init>(r3)     // Catch:{ all -> 0x02f8 }
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ all -> 0x02f8 }
            r9.setTileModeX(r2)     // Catch:{ all -> 0x02f8 }
            boolean r2 = r4 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x02f8 }
            if (r2 == 0) goto L_0x01a2
            int r2 = r4.getIntrinsicWidth()     // Catch:{ all -> 0x02f8 }
            if (r2 != r8) goto L_0x01a2
            int r2 = r4.getIntrinsicHeight()     // Catch:{ all -> 0x02f8 }
            if (r2 != r8) goto L_0x01a2
        L_0x0180:
            r2 = 3
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]     // Catch:{ all -> 0x02f8 }
            r2[r6] = r7     // Catch:{ all -> 0x02f8 }
            r7 = 1
            r2[r7] = r4     // Catch:{ all -> 0x02f8 }
            r3 = 2
            r2[r3] = r9     // Catch:{ all -> 0x02f8 }
            android.graphics.drawable.LayerDrawable r4 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x02f8 }
            r4.<init>(r2)     // Catch:{ all -> 0x02f8 }
            r2 = 16908288(0x1020000, float:2.387723E-38)
            r4.setId(r6, r2)     // Catch:{ all -> 0x02f8 }
            r2 = 16908303(0x102000f, float:2.387727E-38)
            r4.setId(r7, r2)     // Catch:{ all -> 0x02f8 }
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            r4.setId(r3, r2)     // Catch:{ all -> 0x02f8 }
            goto L_0x01d1
        L_0x01a2:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x02f8 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r8, r8, r2)     // Catch:{ all -> 0x02f8 }
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ all -> 0x02f8 }
            r2.<init>(r3)     // Catch:{ all -> 0x02f8 }
            r4.setBounds(r6, r6, r8, r8)     // Catch:{ all -> 0x02f8 }
            r4.draw(r2)     // Catch:{ all -> 0x02f8 }
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x02f8 }
            r4.<init>(r3)     // Catch:{ all -> 0x02f8 }
            goto L_0x0180
        L_0x01b9:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x02f8 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r8, r8, r2)     // Catch:{ all -> 0x02f8 }
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ all -> 0x02f8 }
            r2.<init>(r3)     // Catch:{ all -> 0x02f8 }
            r7.setBounds(r6, r6, r8, r8)     // Catch:{ all -> 0x02f8 }
            r7.draw(r2)     // Catch:{ all -> 0x02f8 }
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x02f8 }
            r7.<init>(r3)     // Catch:{ all -> 0x02f8 }
            goto L_0x0166
        L_0x01d0:
            r4 = 0
        L_0x01d1:
            if (r4 == 0) goto L_0x01dd
            int r2 = r5.changingConfigurations     // Catch:{ all -> 0x02f8 }
            r4.setChangingConfigurations(r2)     // Catch:{ all -> 0x02f8 }
            r10.A09(r11, r4, r0)     // Catch:{ all -> 0x02f8 }
            goto L_0x01dd
        L_0x01dc:
            r4 = 0
        L_0x01dd:
            if (r4 != 0) goto L_0x01e3
            android.graphics.drawable.Drawable r4 = X.AnonymousClass0RP.A00(r11, r12)     // Catch:{ all -> 0x02f8 }
        L_0x01e3:
            if (r4 == 0) goto L_0x02e7
            android.content.res.ColorStateList r1 = r10.A05(r11, r12)     // Catch:{ all -> 0x02f8 }
            if (r1 == 0) goto L_0x020c
            boolean r0 = X.AnonymousClass0XA.A03(r4)     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x01f5
            android.graphics.drawable.Drawable r4 = r4.mutate()     // Catch:{ all -> 0x02f8 }
        L_0x01f5:
            android.graphics.drawable.Drawable r4 = X.C06130Wj.A01(r4)     // Catch:{ all -> 0x02f8 }
            X.AnonymousClass0YG.A01(r1, r4)     // Catch:{ all -> 0x02f8 }
            X.0pq r0 = r10.A01     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x02e7
            r0 = 2131230937(0x7f0800d9, float:1.807794E38)
            if (r12 != r0) goto L_0x02e7
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x02f8 }
            X.AnonymousClass0YG.A04(r0, r4)     // Catch:{ all -> 0x02f8 }
            goto L_0x02e7
        L_0x020c:
            X.0pq r1 = r10.A01     // Catch:{ all -> 0x02f8 }
            if (r1 == 0) goto L_0x02e4
            r0 = 2131230932(0x7f0800d4, float:1.807793E38)
            r5 = 16908301(0x102000d, float:2.3877265E-38)
            r2 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            if (r12 != r0) goto L_0x021f
            goto L_0x02b7
        L_0x021f:
            r0 = 2131230923(0x7f0800cb, float:1.8077912E38)
            if (r12 == r0) goto L_0x028d
            r0 = 2131230922(0x7f0800ca, float:1.807791E38)
            if (r12 == r0) goto L_0x028d
            r0 = 2131230924(0x7f0800cc, float:1.8077915E38)
            if (r12 == r0) goto L_0x028d
            r3 = r4
            X.0bM r1 = (X.C07640bM) r1     // Catch:{ all -> 0x02f8 }
            android.graphics.PorterDuff$Mode r5 = X.AnonymousClass0XJ.A02     // Catch:{ all -> 0x02f8 }
            int[] r0 = r1.A02     // Catch:{ all -> 0x02f8 }
            boolean r0 = X.C07640bM.A02(r0, r12)     // Catch:{ all -> 0x02f8 }
            r2 = -1
            if (r0 == 0) goto L_0x023d
            goto L_0x0263
        L_0x023d:
            int[] r0 = r1.A01     // Catch:{ all -> 0x02f8 }
            boolean r0 = X.C07640bM.A02(r0, r12)     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x0249
            r6 = 2130968995(0x7f0401a3, float:1.754666E38)
            goto L_0x0266
        L_0x0249:
            int[] r0 = r1.A00     // Catch:{ all -> 0x02f8 }
            boolean r0 = X.C07640bM.A02(r0, r12)     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x0254
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x02f8 }
            goto L_0x025f
        L_0x0254:
            r0 = 2131230909(0x7f0800bd, float:1.8077884E38)
            if (r12 != r0) goto L_0x025a
            goto L_0x0268
        L_0x025a:
            r0 = 2131230891(0x7f0800ab, float:1.8077848E38)
            if (r12 != r0) goto L_0x02e4
        L_0x025f:
            r6 = 16842801(0x1010031, float:2.3693695E-38)
            goto L_0x0266
        L_0x0263:
            r6 = 2130968997(0x7f0401a5, float:1.7546663E38)
        L_0x0266:
            r1 = -1
            goto L_0x0272
        L_0x0268:
            r0 = 1109603123(0x42233333, float:40.8)
            int r1 = java.lang.Math.round(r0)     // Catch:{ all -> 0x02f8 }
            r6 = 16842800(0x1010030, float:2.3693693E-38)
        L_0x0272:
            boolean r0 = X.AnonymousClass0XA.A03(r4)     // Catch:{ all -> 0x02f8 }
            if (r0 == 0) goto L_0x027c
            android.graphics.drawable.Drawable r3 = r4.mutate()     // Catch:{ all -> 0x02f8 }
        L_0x027c:
            int r0 = X.AnonymousClass0XB.A01(r11, r6)     // Catch:{ all -> 0x02f8 }
            android.graphics.PorterDuffColorFilter r0 = X.AnonymousClass0XJ.A00(r5, r0)     // Catch:{ all -> 0x02f8 }
            r3.setColorFilter(r0)     // Catch:{ all -> 0x02f8 }
            if (r1 == r2) goto L_0x02e7
            r3.setAlpha(r1)     // Catch:{ all -> 0x02f8 }
            goto L_0x02e7
        L_0x028d:
            r3 = r4
            android.graphics.drawable.LayerDrawable r3 = (android.graphics.drawable.LayerDrawable) r3     // Catch:{ all -> 0x02f8 }
            android.graphics.drawable.Drawable r1 = r3.findDrawableByLayerId(r6)     // Catch:{ all -> 0x02f8 }
            r0 = 2130968997(0x7f0401a5, float:1.7546663E38)
            int r0 = X.AnonymousClass0XB.A00(r11, r0)     // Catch:{ all -> 0x02f8 }
            android.graphics.PorterDuff$Mode r6 = X.AnonymousClass0XJ.A02     // Catch:{ all -> 0x02f8 }
            X.C07640bM.A01(r6, r1, r0)     // Catch:{ all -> 0x02f8 }
            android.graphics.drawable.Drawable r2 = r3.findDrawableByLayerId(r2)     // Catch:{ all -> 0x02f8 }
            r1 = 2130968995(0x7f0401a3, float:1.754666E38)
            int r0 = X.AnonymousClass0XB.A01(r11, r1)     // Catch:{ all -> 0x02f8 }
            X.C07640bM.A01(r6, r2, r0)     // Catch:{ all -> 0x02f8 }
            android.graphics.drawable.Drawable r2 = r3.findDrawableByLayerId(r5)     // Catch:{ all -> 0x02f8 }
            int r0 = X.AnonymousClass0XB.A01(r11, r1)     // Catch:{ all -> 0x02f8 }
            goto L_0x02e0
        L_0x02b7:
            r7 = r4
            android.graphics.drawable.LayerDrawable r7 = (android.graphics.drawable.LayerDrawable) r7     // Catch:{ all -> 0x02f8 }
            android.graphics.drawable.Drawable r1 = r7.findDrawableByLayerId(r6)     // Catch:{ all -> 0x02f8 }
            r3 = 2130968997(0x7f0401a5, float:1.7546663E38)
            int r0 = X.AnonymousClass0XB.A01(r11, r3)     // Catch:{ all -> 0x02f8 }
            android.graphics.PorterDuff$Mode r6 = X.AnonymousClass0XJ.A02     // Catch:{ all -> 0x02f8 }
            X.C07640bM.A01(r6, r1, r0)     // Catch:{ all -> 0x02f8 }
            android.graphics.drawable.Drawable r1 = r7.findDrawableByLayerId(r2)     // Catch:{ all -> 0x02f8 }
            int r0 = X.AnonymousClass0XB.A01(r11, r3)     // Catch:{ all -> 0x02f8 }
            X.C07640bM.A01(r6, r1, r0)     // Catch:{ all -> 0x02f8 }
            android.graphics.drawable.Drawable r2 = r7.findDrawableByLayerId(r5)     // Catch:{ all -> 0x02f8 }
            r0 = 2130968995(0x7f0401a3, float:1.754666E38)
            int r0 = X.AnonymousClass0XB.A01(r11, r0)     // Catch:{ all -> 0x02f8 }
        L_0x02e0:
            X.C07640bM.A01(r6, r2, r0)     // Catch:{ all -> 0x02f8 }
            goto L_0x02e7
        L_0x02e4:
            if (r13 == 0) goto L_0x02e7
            r4 = 0
        L_0x02e7:
            if (r4 == 0) goto L_0x02ec
            X.AnonymousClass0XA.A02(r4)     // Catch:{ all -> 0x02f8 }
        L_0x02ec:
            monitor-exit(r10)
            return r4
        L_0x02ee:
            r0 = 0
            r10.A05 = r0     // Catch:{ all -> 0x02f8 }
            java.lang.String r0 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x02f8 }
            throw r0     // Catch:{ all -> 0x02f8 }
        L_0x02f8:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XW.A07(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable A08(android.content.Context r5, long r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.WeakHashMap r0 = r4.A06     // Catch:{ all -> 0x002b }
            java.lang.Object r3 = r0.get(r5)     // Catch:{ all -> 0x002b }
            X.0i7 r3 = (X.C10550i7) r3     // Catch:{ all -> 0x002b }
            r2 = 0
            if (r3 == 0) goto L_0x0029
            java.lang.Object r0 = r3.A05(r6, r2)     // Catch:{ all -> 0x002b }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0029
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x002b }
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0026
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ all -> 0x002b }
            android.graphics.drawable.Drawable r0 = r1.newDrawable(r0)     // Catch:{ all -> 0x002b }
            monitor-exit(r4)
            return r0
        L_0x0026:
            r3.A08(r6)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)
            return r2
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XW.A08(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public final synchronized void A09(Context context, Drawable drawable, long j) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.A06;
            C10550i7 r1 = (C10550i7) weakHashMap.get(context);
            if (r1 == null) {
                r1 = new C10550i7();
                weakHashMap.put(context, r1);
            }
            r1.A0A(j, new WeakReference(constantState));
        }
    }

    public static synchronized PorterDuffColorFilter A00(PorterDuff.Mode mode, int i) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (AnonymousClass0XW.class) {
            AnonymousClass05B r3 = A09;
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) r3.A04(Integer.valueOf(AnonymousClass002.A02(mode, i2)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                r3.A08(Integer.valueOf(AnonymousClass002.A02(mode, i2)), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static synchronized AnonymousClass0XW A03() {
        AnonymousClass0XW r0;
        synchronized (AnonymousClass0XW.class) {
            if (A07 == null) {
                AnonymousClass0XW r2 = new AnonymousClass0XW();
                A07 = r2;
                if (Build.VERSION.SDK_INT < 24) {
                    r2.A0A(new C07630bL(), "vector");
                    r2.A0A(new C07610bJ(), "animated-vector");
                    r2.A0A(new C07600bI(), "animated-selector");
                    r2.A0A(new C07620bK(), "drawable");
                }
            }
            r0 = A07;
        }
        return r0;
    }

    public final void A0A(C15600rd r2, String str) {
        C06290Wz r0 = this.A02;
        if (r0 == null) {
            r0 = new C06290Wz();
            this.A02 = r0;
        }
        r0.put(str, r2);
    }

    public static Drawable A01(Context context, int i) {
        return A03().A06(context, i);
    }

    public static Drawable A02(View view, int i) {
        return A03().A06(view.getContext(), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(android.graphics.drawable.Drawable r3, X.C03900Lz r4, int[] r5) {
        /*
            boolean r0 = X.AnonymousClass0XA.A03(r3)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r0 = r3.mutate()
            if (r0 == r3) goto L_0x0014
            java.lang.String r1 = "ResourceManagerInternal"
            java.lang.String r0 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r1, r0)
        L_0x0013:
            return
        L_0x0014:
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0042
            r2 = 0
        L_0x001d:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x003f
            android.graphics.PorterDuff$Mode r1 = r4.A01
        L_0x0023:
            if (r2 == 0) goto L_0x003d
            if (r1 == 0) goto L_0x003d
            r0 = 0
            int r0 = r2.getColorForState(r5, r0)
            android.graphics.PorterDuffColorFilter r0 = A00(r1, r0)
        L_0x0030:
            r3.setColorFilter(r0)
        L_0x0033:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 > r0) goto L_0x0013
            r3.invalidateSelf()
            return
        L_0x003d:
            r0 = 0
            goto L_0x0030
        L_0x003f:
            android.graphics.PorterDuff$Mode r1 = A08
            goto L_0x0023
        L_0x0042:
            r3.clearColorFilter()
            goto L_0x0033
        L_0x0046:
            android.content.res.ColorStateList r2 = r4.A00
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XW.A04(android.graphics.drawable.Drawable, X.0Lz, int[]):void");
    }
}
