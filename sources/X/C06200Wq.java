package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.R;

/* renamed from: X.0Wq  reason: invalid class name and case insensitive filesystem */
public class C06200Wq {
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Drawable A07;
    public Handler A08;
    public Message A09;
    public Message A0A;
    public Message A0B;
    public View A0C;
    public View A0D;
    public Button A0E;
    public Button A0F;
    public Button A0G;
    public ImageView A0H;
    public ListAdapter A0I;
    public ListView A0J;
    public TextView A0K;
    public TextView A0L;
    public NestedScrollView A0M;
    public CharSequence A0N;
    public CharSequence A0O;
    public CharSequence A0P;
    public CharSequence A0Q;
    public CharSequence A0R;
    public boolean A0S;
    public final Context A0T;
    public final View.OnClickListener A0U = new C17760wC(this, 0);
    public final Window A0V;
    public final AnonymousClass00Q A0W;

    public static void A01(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            int i2 = 4;
            if (view.canScrollVertically(-1)) {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    public static final ViewGroup A00(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: android.widget.ListView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: androidx.core.widget.NestedScrollView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: android.widget.ListView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: android.widget.ListView} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0143, code lost:
        if (r9.getVisibility() == 8) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0043, code lost:
        if (r11 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        if (A02(r11) == false) goto L_0x004c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r13 = this;
            int r1 = r13.A00
            X.00Q r0 = r13.A0W
            r0.setContentView((int) r1)
            android.view.Window r6 = r13.A0V
            r0 = 2131432053(0x7f0b1275, float:1.8485853E38)
            android.view.View r1 = r6.findViewById(r0)
            r2 = 2131434347(0x7f0b1b6b, float:1.8490505E38)
            android.view.View r7 = r1.findViewById(r2)
            r9 = 2131429058(0x7f0b06c2, float:1.8479778E38)
            android.view.View r4 = r1.findViewById(r9)
            r8 = 2131428329(0x7f0b03e9, float:1.84783E38)
            android.view.View r3 = r1.findViewById(r8)
            r0 = 2131429245(0x7f0b077d, float:1.8480157E38)
            android.view.View r5 = r1.findViewById(r0)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r11 = r13.A0D
            r10 = 0
            if (r11 != 0) goto L_0x0045
            int r0 = r13.A06
            if (r0 == 0) goto L_0x0333
            android.content.Context r0 = r13.A0T
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int r0 = r13.A06
            android.view.View r11 = r1.inflate(r0, r5, r10)
            if (r11 == 0) goto L_0x004c
        L_0x0045:
            r10 = 1
            boolean r0 = A02(r11)
            if (r0 != 0) goto L_0x0314
        L_0x004c:
            r0 = 131072(0x20000, float:1.83671E-40)
            r6.setFlags(r0, r0)
            if (r10 != 0) goto L_0x0314
            r0 = 8
            r5.setVisibility(r0)
        L_0x0058:
            android.view.View r2 = r5.findViewById(r2)
            android.view.View r1 = r5.findViewById(r9)
            android.view.View r0 = r5.findViewById(r8)
            android.view.ViewGroup r9 = A00(r2, r7)
            android.view.ViewGroup r8 = A00(r1, r4)
            android.view.ViewGroup r7 = A00(r0, r3)
            r0 = 2131433253(0x7f0b1725, float:1.8488286E38)
            android.view.View r0 = r6.findViewById(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r13.A0M = r0
            r1 = 0
            r0.setFocusable(r1)
            androidx.core.widget.NestedScrollView r0 = r13.A0M
            r0.setNestedScrollingEnabled(r1)
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r8, r0)
            r13.A0K = r1
            if (r1 == 0) goto L_0x0096
            java.lang.CharSequence r0 = r13.A0Q
            if (r0 == 0) goto L_0x02e1
            r1.setText(r0)
        L_0x0096:
            r0 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.A0G = r0
            android.view.View$OnClickListener r10 = r13.A0U
            r0.setOnClickListener(r10)
            java.lang.CharSequence r0 = r13.A0P
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 8
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x02d2
            android.widget.Button r0 = r13.A0G
            r0.setVisibility(r4)
            r11 = 0
        L_0x00b8:
            r0 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.A0E = r0
            r0.setOnClickListener(r10)
            java.lang.CharSequence r0 = r13.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02c2
            android.widget.Button r0 = r13.A0E
            r0.setVisibility(r4)
        L_0x00d3:
            r0 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.A0F = r0
            r0.setOnClickListener(r10)
            java.lang.CharSequence r0 = r13.A0O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02b2
            android.widget.Button r0 = r13.A0F
            r0.setVisibility(r4)
        L_0x00ee:
            android.content.Context r0 = r13.A0T
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r0.getTheme()
            r0 = 2130968645(0x7f040045, float:1.754595E38)
            r1.resolveAttribute(r0, r2, r3)
            int r0 = r2.data
            if (r0 == 0) goto L_0x02ab
            if (r11 != r3) goto L_0x029d
            android.widget.Button r2 = r13.A0G
        L_0x0107:
            android.widget.LinearLayout$LayoutParams r1 = X.AnonymousClass001.A0U(r2)
            r1.gravity = r3
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.weight = r0
            r2.setLayoutParams(r1)
        L_0x0114:
            r1 = r9
            android.view.View r0 = r13.A0C
            r2 = 8
            if (r0 == 0) goto L_0x0234
            r1 = -1
            r0 = -2
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r1, r0)
            android.view.View r1 = r13.A0C
            r0 = 0
            r9.addView(r1, r0, r3)
            r0 = 2131434315(0x7f0b1b4b, float:1.849044E38)
            android.view.View r1 = r6.findViewById(r0)
        L_0x012f:
            r1.setVisibility(r4)
        L_0x0132:
            int r0 = r5.getVisibility()
            r3 = 1
            r10 = 0
            boolean r12 = X.AnonymousClass001.A1X(r0, r2)
            if (r9 == 0) goto L_0x0145
            int r0 = r9.getVisibility()
            r5 = 1
            if (r0 != r2) goto L_0x0146
        L_0x0145:
            r5 = 0
        L_0x0146:
            int r0 = r7.getVisibility()
            r11 = 1
            if (r0 != r2) goto L_0x015a
            r11 = 0
            r0 = 2131434204(0x7f0b1adc, float:1.8490215E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x015a
            r0.setVisibility(r10)
        L_0x015a:
            if (r5 == 0) goto L_0x022b
            androidx.core.widget.NestedScrollView r0 = r13.A0M
            if (r0 == 0) goto L_0x0163
            r0.setClipToPadding(r3)
        L_0x0163:
            java.lang.CharSequence r0 = r13.A0Q
            if (r0 != 0) goto L_0x016b
            android.widget.ListView r0 = r13.A0J
            if (r0 == 0) goto L_0x0177
        L_0x016b:
            r0 = 2131434292(0x7f0b1b34, float:1.8490394E38)
            android.view.View r0 = r9.findViewById(r0)
        L_0x0172:
            if (r0 == 0) goto L_0x0177
            r0.setVisibility(r10)
        L_0x0177:
            android.widget.ListView r7 = r13.A0J
            boolean r0 = r7 instanceof androidx.appcompat.app.AlertController$RecycleListView
            if (r0 == 0) goto L_0x019a
            androidx.appcompat.app.AlertController$RecycleListView r7 = (androidx.appcompat.app.AlertController$RecycleListView) r7
            if (r11 == 0) goto L_0x0183
            if (r5 != 0) goto L_0x019a
        L_0x0183:
            int r4 = r7.getPaddingLeft()
            if (r5 == 0) goto L_0x0227
            int r2 = r7.getPaddingTop()
        L_0x018d:
            int r1 = r7.getPaddingRight()
            if (r11 == 0) goto L_0x0223
            int r0 = r7.getPaddingBottom()
        L_0x0197:
            r7.setPadding(r4, r2, r1, r0)
        L_0x019a:
            if (r12 != 0) goto L_0x01c9
            android.widget.ListView r7 = r13.A0J
            if (r7 != 0) goto L_0x01a4
            androidx.core.widget.NestedScrollView r7 = r13.A0M
            if (r7 == 0) goto L_0x01c9
        L_0x01a4:
            if (r11 == 0) goto L_0x01a7
            r10 = 2
        L_0x01a7:
            r5 = r5 | r10
            r0 = 2131433252(0x7f0b1724, float:1.8488284E38)
            android.view.View r2 = r6.findViewById(r0)
            r0 = 2131433251(0x7f0b1723, float:1.8488282E38)
            android.view.View r4 = r6.findViewById(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x01e0
            X.C06560Yg.A0N(r7, r5)
        L_0x01bf:
            if (r2 == 0) goto L_0x01c4
            r8.removeView(r2)
        L_0x01c4:
            if (r4 == 0) goto L_0x01c9
            r8.removeView(r4)
        L_0x01c9:
            android.widget.ListView r2 = r13.A0J
            if (r2 == 0) goto L_0x01df
            android.widget.ListAdapter r0 = r13.A0I
            if (r0 == 0) goto L_0x01df
            r2.setAdapter(r0)
            int r1 = r13.A01
            r0 = -1
            if (r1 <= r0) goto L_0x01df
            r2.setItemChecked(r1, r3)
            r2.setSelection(r1)
        L_0x01df:
            return
        L_0x01e0:
            r1 = 0
            if (r2 == 0) goto L_0x01eb
            r0 = r5 & 1
            if (r0 != 0) goto L_0x01eb
            r8.removeView(r2)
            r2 = r1
        L_0x01eb:
            if (r4 == 0) goto L_0x01f5
            r0 = r5 & 2
            if (r0 != 0) goto L_0x01f5
            r8.removeView(r4)
            r4 = r1
        L_0x01f5:
            if (r2 != 0) goto L_0x01f9
            if (r4 == 0) goto L_0x01c9
        L_0x01f9:
            java.lang.CharSequence r0 = r13.A0Q
            if (r0 == 0) goto L_0x020f
            androidx.core.widget.NestedScrollView r1 = r13.A0M
            X.0dW r0 = new X.0dW
            r0.<init>(r2, r4, r13)
            r1.A0E = r0
            X.0le r0 = new X.0le
            r0.<init>(r2, r4, r13)
        L_0x020b:
            r1.post(r0)
            goto L_0x01c9
        L_0x020f:
            android.widget.ListView r1 = r13.A0J
            if (r1 == 0) goto L_0x01bf
            X.0ah r0 = new X.0ah
            r0.<init>(r2, r4, r13)
            r1.setOnScrollListener(r0)
            android.widget.ListView r1 = r13.A0J
            X.0lf r0 = new X.0lf
            r0.<init>(r2, r4, r13)
            goto L_0x020b
        L_0x0223:
            int r0 = r7.A00
            goto L_0x0197
        L_0x0227:
            int r2 = r7.A01
            goto L_0x018d
        L_0x022b:
            r0 = 2131434205(0x7f0b1add, float:1.8490217E38)
            android.view.View r0 = r8.findViewById(r0)
            goto L_0x0172
        L_0x0234:
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r13.A0H = r0
            java.lang.CharSequence r0 = r13.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x028c
            boolean r0 = r13.A0S
            if (r0 == 0) goto L_0x028c
            r0 = 2131427668(0x7f0b0154, float:1.8476959E38)
            android.view.View r1 = r6.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r13.A0L = r1
            java.lang.CharSequence r0 = r13.A0R
            r1.setText(r0)
            android.graphics.drawable.Drawable r1 = r13.A07
            if (r1 == 0) goto L_0x0268
            android.widget.ImageView r0 = r13.A0H
            r0.setImageDrawable(r1)
            goto L_0x0132
        L_0x0268:
            android.widget.TextView r10 = r13.A0L
            android.widget.ImageView r0 = r13.A0H
            int r4 = r0.getPaddingLeft()
            android.widget.ImageView r0 = r13.A0H
            int r3 = r0.getPaddingTop()
            android.widget.ImageView r0 = r13.A0H
            int r1 = r0.getPaddingRight()
            android.widget.ImageView r0 = r13.A0H
            int r0 = r0.getPaddingBottom()
            r10.setPadding(r4, r3, r1, r0)
            android.widget.ImageView r0 = r13.A0H
            r0.setVisibility(r2)
            goto L_0x0132
        L_0x028c:
            r0 = 2131434315(0x7f0b1b4b, float:1.849044E38)
            android.view.View r0 = r6.findViewById(r0)
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r13.A0H
            r0.setVisibility(r4)
            goto L_0x012f
        L_0x029d:
            r0 = 2
            if (r11 != r0) goto L_0x02a4
            android.widget.Button r2 = r13.A0E
            goto L_0x0107
        L_0x02a4:
            r0 = 4
            if (r11 != r0) goto L_0x02ab
            android.widget.Button r2 = r13.A0F
            goto L_0x0107
        L_0x02ab:
            if (r11 != 0) goto L_0x0114
            r7.setVisibility(r4)
            goto L_0x0114
        L_0x02b2:
            android.widget.Button r1 = r13.A0F
            java.lang.CharSequence r0 = r13.A0O
            r1.setText(r0)
            android.widget.Button r0 = r13.A0F
            r0.setVisibility(r2)
            r11 = r11 | 4
            goto L_0x00ee
        L_0x02c2:
            android.widget.Button r1 = r13.A0E
            java.lang.CharSequence r0 = r13.A0N
            r1.setText(r0)
            android.widget.Button r0 = r13.A0E
            r0.setVisibility(r2)
            r11 = r11 | 2
            goto L_0x00d3
        L_0x02d2:
            android.widget.Button r1 = r13.A0G
            java.lang.CharSequence r0 = r13.A0P
            r1.setText(r0)
            android.widget.Button r0 = r13.A0G
            r0.setVisibility(r2)
            r11 = 1
            goto L_0x00b8
        L_0x02e1:
            r2 = 8
            r1.setVisibility(r2)
            androidx.core.widget.NestedScrollView r1 = r13.A0M
            android.widget.TextView r0 = r13.A0K
            r1.removeView(r0)
            android.widget.ListView r0 = r13.A0J
            if (r0 == 0) goto L_0x030f
            androidx.core.widget.NestedScrollView r0 = r13.A0M
            android.view.ViewParent r4 = r0.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            androidx.core.widget.NestedScrollView r0 = r13.A0M
            int r3 = r4.indexOfChild(r0)
            r4.removeViewAt(r3)
            android.widget.ListView r2 = r13.A0J
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r4.addView(r2, r3, r0)
            goto L_0x0096
        L_0x030f:
            r8.setVisibility(r2)
            goto L_0x0096
        L_0x0314:
            r0 = 2131429244(0x7f0b077c, float:1.8480155E38)
            android.view.View r10 = r6.findViewById(r0)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r10.addView(r11, r0)
            android.widget.ListView r0 = r13.A0J
            if (r0 == 0) goto L_0x0058
            android.widget.LinearLayout$LayoutParams r1 = X.AnonymousClass001.A0U(r5)
            r0 = 0
            r1.weight = r0
            goto L_0x0058
        L_0x0333:
            r11 = 0
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06200Wq.A03():void");
    }

    public C06200Wq(Context context, Window window, AnonymousClass00Q r7) {
        this.A0T = context;
        this.A0W = r7;
        this.A0V = window;
        this.A08 = new AnonymousClass01x(r7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, AnonymousClass0KC.A04, R.attr.f3nameremoved, 0);
        this.A00 = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.A03 = obtainStyledAttributes.getResourceId(4, 0);
        this.A04 = obtainStyledAttributes.getResourceId(5, 0);
        this.A05 = obtainStyledAttributes.getResourceId(7, 0);
        this.A02 = obtainStyledAttributes.getResourceId(3, 0);
        this.A0S = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        r7.A01().A0J(1);
    }

    public static boolean A02(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (A02(viewGroup.getChildAt(childCount))) {
                }
            }
        }
        return false;
        return true;
    }
}
