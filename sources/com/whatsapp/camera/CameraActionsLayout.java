package com.whatsapp.camera;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.AnonymousClass5YI;
import X.C06560Yg;
import X.C116855qy;
import X.C118425tW;
import X.C18280x3;
import X.C18300x5;
import X.C18320x8;
import X.C620633i;
import X.C64333Db;
import X.C88864av;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class CameraActionsLayout extends RelativeLayout implements AnonymousClass4GJ {
    public static final Set A0I = new C118425tW();
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public AnonymousClass1VX A08;
    public C116855qy A09;
    public boolean A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Display A0F;
    public final Map A0G;
    public final boolean A0H;

    public final Object generatedComponent() {
        C116855qy r0 = this.A09;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        Map map;
        int i8;
        Integer num;
        Integer num2;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        if (this.A06 == null) {
            this.A06 = C06560Yg.A02(this, R.id.shutter);
            this.A05 = C06560Yg.A02(this, R.id.recording_progress);
            this.A01 = C06560Yg.A02(this, R.id.flash_btn);
            this.A07 = C06560Yg.A02(this, R.id.switch_camera_btn);
            this.A04 = C06560Yg.A02(this, R.id.recording_hint);
            this.A02 = C06560Yg.A02(this, R.id.gallery_btn);
            this.A00 = C06560Yg.A02(this, R.id.close_camera_btn);
            this.A03 = C06560Yg.A02(this, R.id.select_multiple);
        }
        if (z) {
            int rotation = this.A0F.getRotation();
            if (!this.A0H) {
                if (rotation == 1) {
                    this.A04.setVisibility(8);
                    map = this.A0G;
                    map.clear();
                    Integer A0Z = C18300x5.A0Z();
                    num = AnonymousClass0x7.A0f();
                    map.put(A0Z, num);
                    num2 = AnonymousClass0x9.A0j();
                    map.put(num2, num);
                    View view = this.A06;
                    i7 = this.A0E;
                    i6 = 0;
                    int i10 = i7;
                    A00(view, map, i7, 0, i10, 0);
                    A00(this.A05, map, i7, 0, i10, 0);
                    map.clear();
                    Integer A0h = AnonymousClass0x7.A0h();
                    map.put(A0h, num);
                    map.put(A0Z, num);
                    View view2 = this.A07;
                    i5 = this.A0D;
                    int i11 = i5;
                    int i12 = i5;
                    Map map2 = map;
                    int i13 = i5;
                    A00(view2, map2, i5, i13, i11, i12);
                    map.clear();
                    i8 = 12;
                    map.put(12, num);
                    map.put(A0Z, num);
                    A00(this.A02, map2, i5, i13, i11, i12);
                    map.clear();
                    map.put(A0h, num);
                    i9 = 9;
                } else if (rotation != 3) {
                    Map map3 = this.A0G;
                    map3.clear();
                    Integer A0S = C18280x3.A0S();
                    Integer valueOf = Integer.valueOf(R.id.recording_hint);
                    map3.put(A0S, valueOf);
                    Integer A0W = C18320x8.A0W();
                    Integer A0f = AnonymousClass0x7.A0f();
                    map3.put(A0W, A0f);
                    map3.put(12, A0f);
                    View view3 = this.A06;
                    int i14 = this.A0D;
                    A00(view3, map3, 0, 0, 0, i14);
                    A00(this.A05, map3, 0, 0, 0, i14);
                    map3.clear();
                    map3.put(A0S, valueOf);
                    Integer A0Z2 = C18300x5.A0Z();
                    map3.put(A0Z2, A0f);
                    map3.put(12, A0f);
                    View view4 = this.A07;
                    int i15 = this.A0E;
                    int i16 = this.A0B;
                    Map map4 = map3;
                    int i17 = i15;
                    int i18 = i16 + i16;
                    A00(view4, map4, i15, 0, i17, i18);
                    map3.clear();
                    map3.put(A0S, valueOf);
                    Integer A0Y = C18300x5.A0Y();
                    map3.put(A0Y, A0f);
                    map3.put(12, A0f);
                    A00(this.A02, map4, i15, 0, i17, i18);
                    map3.clear();
                    Integer A0h2 = AnonymousClass0x7.A0h();
                    map3.put(A0h2, A0f);
                    map3.put(A0Z2, A0f);
                    int i19 = i15;
                    int i20 = i15;
                    A00(this.A01, map4, i15, i20, i17, i19);
                    map3.clear();
                    map3.put(A0h2, A0f);
                    map3.put(A0Y, A0f);
                    A00(this.A00, map4, i15, i20, i17, i19);
                    map3.clear();
                    map3.put(A0Z2, A0f);
                    map3.put(12, A0f);
                    A00(this.A03, map3, i15, 0, i15, this.A0C);
                    return;
                } else {
                    this.A04.setVisibility(8);
                    map = this.A0G;
                    map.clear();
                    Integer A0Y2 = C18300x5.A0Y();
                    num = AnonymousClass0x7.A0f();
                    map.put(A0Y2, num);
                    num2 = AnonymousClass0x9.A0j();
                    map.put(num2, num);
                    View view5 = this.A06;
                    i7 = this.A0E;
                    i6 = 0;
                    int i21 = i7;
                    A00(view5, map, i7, 0, i21, 0);
                    A00(this.A05, map, i7, 0, i21, 0);
                    map.clear();
                    map.put(12, num);
                    map.put(A0Y2, num);
                    View view6 = this.A07;
                    i5 = this.A0D;
                    int i22 = i5;
                    int i23 = i5;
                    Map map5 = map;
                    int i24 = i5;
                    A00(view6, map5, i5, i24, i22, i23);
                    map.clear();
                    i8 = AnonymousClass0x7.A0h();
                    map.put(i8, num);
                    map.put(A0Y2, num);
                    A00(this.A02, map5, i5, i24, i22, i23);
                    map.clear();
                    map.put(12, num);
                    i9 = 11;
                }
                Integer valueOf2 = Integer.valueOf(i9);
                map.put(valueOf2, num);
                int i25 = i7;
                int i26 = i5;
                Map map6 = map;
                int i27 = i7;
                int i28 = i5;
                A00(this.A01, map6, i27, i28, i25, i26);
                map.clear();
                map.put(i8, num);
                map.put(valueOf2, num);
                A00(this.A00, map6, i27, i28, i25, i26);
                map.clear();
                map.put(valueOf2, num);
                map.put(num2, num);
                A00(this.A03, map, i7, i6, i7, i6);
            }
        }
    }

    public CameraActionsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0A) {
            this.A0A = true;
            this.A08 = C64333Db.A4B(C88864av.A00(generatedComponent()));
        }
        this.A0G = AnonymousClass001.A0t();
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A0H = C18280x3.A1U(AnonymousClass001.A0M(context).smallestScreenWidthDp, 600);
        WindowManager A012 = C620633i.A01(context);
        Objects.requireNonNull(A012);
        this.A0F = A012.getDefaultDisplay();
        int A042 = AnonymousClass5YI.A04(context, 2.0f);
        int i2 = A042 * 4;
        this.A0E = i2;
        this.A0B = A042 * 6;
        int i3 = i2 + i2;
        this.A0D = i3;
        this.A0C = i3 * 10;
    }

    public static final void A00(View view, Map map, int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(view.getLayoutParams());
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            layoutParams.addRule(C18280x3.A05(it), 0);
        }
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            layoutParams.addRule(C18280x3.A06(A0w), AnonymousClass0x2.A08(A0w));
        }
        layoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(layoutParams);
    }

    public CameraActionsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraActionsLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
