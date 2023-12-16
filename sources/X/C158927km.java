package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7km  reason: invalid class name and case insensitive filesystem */
public class C158927km {
    public float A00;
    public int A01;
    public C32741rX A02;
    public C153447bK A03;
    public boolean A04;
    public final Activity A05;
    public final HandlerThread A06;
    public final View A07;
    public final View A08;
    public final ViewGroup A09;
    public final C15910sA A0A;
    public final C620733j A0B;
    public final AnonymousClass5Y0 A0C;
    public final AnonymousClass1VX A0D;
    public final MediaComposerFragment A0E;
    public final C27831ek A0F;
    public final C67513Po A0G;
    public final AnonymousClass7EB A0H = new AnonymousClass7EB(this);
    public final C182678oo A0I;
    public final AnonymousClass6Hm A0J;
    public final C124716Dp A0K;
    public final C124766Du A0L;
    public final C125426Hz A0M;
    public final AnonymousClass7XM A0N;
    public final C125226Gy A0O;
    public final AnonymousClass6H6 A0P;
    public final ShapePickerRecyclerView A0Q;
    public final ShapePickerView A0R;
    public final C27801eg A0S;
    public final C135736lA A0T;
    public final C135726l9 A0U;
    public final AnonymousClass33O A0V;
    public final C56872sh A0W = new AnonymousClass909(this, 0);
    public final C29361ih A0X;
    public final C105895Wv A0Y;
    public final AnonymousClass107 A0Z = new AnonymousClass107(Boolean.FALSE);
    public final AnonymousClass4FS A0a;
    public final Map A0b = AnonymousClass001.A0t();
    public final Map A0c = AnonymousClass001.A0t();
    public final Set A0d = AnonymousClass0x9.A17();
    public final ConcurrentHashMap A0e = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A0f = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A0g;

    public final void A00(C50612iT r6) {
        ArrayList<AnonymousClass3QV> A0s = AnonymousClass001.A0s();
        Iterator it = r6.A05.iterator();
        while (it.hasNext()) {
            A0s.add(new AnonymousClass3QV(AnonymousClass0x7.A0b(it), this.A0V));
        }
        for (AnonymousClass3QV r2 : A0s) {
            this.A0g.put(r2.BDW(), r2);
        }
        Map map = this.A0b;
        String str = r6.A0G;
        map.put(str, r6);
        this.A0c.put(str, A0s);
    }

    public final void A01(Collection collection, boolean z) {
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3QV r2 = new AnonymousClass3QV(AnonymousClass0x7.A0b(it), this.A0V);
            this.A0g.put(r2.BDW(), r2);
            A17.add(r2);
        }
        if (z) {
            Set set = this.A0d;
            A17.addAll(set);
            set.clear();
        }
        Set<C85164Fe> set2 = this.A0d;
        set2.addAll(A17);
        C67513Po r3 = this.A0G;
        synchronized (r3) {
            Map map = r3.A03;
            map.clear();
            for (C85164Fe A002 : set2) {
                C67513Po.A00(A002, map);
            }
        }
    }

    public C158927km(Activity activity, ViewGroup viewGroup, C15910sA r27, C15940sD r28, C620733j r29, AnonymousClass5Y0 r30, AnonymousClass1VX r31, MediaComposerFragment mediaComposerFragment, C27831ek r33, C67513Po r34, C182678oo r35, ShapePickerView shapePickerView, C27801eg r37, AnonymousClass33O r38, C29361ih r39, C56932sn r40, C105895Wv r41, AnonymousClass4FS r42) {
        Activity activity2 = activity;
        this.A05 = activity2;
        this.A0D = r31;
        C105895Wv r9 = r41;
        this.A0Y = r9;
        AnonymousClass4FS r1 = r42;
        this.A0a = r1;
        this.A0C = r30;
        C27831ek r20 = r33;
        this.A0F = r20;
        C620733j r23 = r29;
        this.A0B = r23;
        C29361ih r7 = r39;
        this.A0X = r7;
        C27801eg r22 = r37;
        this.A0S = r22;
        this.A0G = r34;
        this.A0V = r38;
        C15910sA r11 = r27;
        this.A0A = r11;
        this.A0I = r35;
        this.A09 = viewGroup;
        this.A0E = mediaComposerFragment;
        C15940sD r12 = r28;
        this.A0P = (AnonymousClass6H6) new AnonymousClass0XL((C17190ui) new AnonymousClass80L(), r12).A01(AnonymousClass6H6.class);
        this.A0O = (C125226Gy) new AnonymousClass0XL((C17190ui) new AnonymousClass80L(), r12).A01(C125226Gy.class);
        AnonymousClass6Hm r3 = new AnonymousClass6Hm(this);
        this.A0J = r3;
        ShapePickerView shapePickerView2 = shapePickerView;
        this.A0R = shapePickerView2;
        this.A08 = C06560Yg.A02(shapePickerView2, R.id.shape_picker_gradient);
        this.A07 = C06560Yg.A02(shapePickerView2, R.id.shape_picker_header);
        ShapePickerRecyclerView shapePickerRecyclerView = (ShapePickerRecyclerView) C06560Yg.A02(shapePickerView2, R.id.shapes);
        this.A0Q = shapePickerRecyclerView;
        shapePickerRecyclerView.setAdapter(r3);
        List<C85164Fe> A002 = C58022ua.A00();
        this.A0g = AnonymousClass0x9.A1D();
        for (C85164Fe r4 : A002) {
            this.A0g.put(r4.BDW(), r4);
        }
        this.A0T = new C135736lA((RecyclerView) shapePickerView2.findViewById(R.id.emoji_shape_subcategories_recyclerview), this.A0H, this.A0Q);
        C56932sn r15 = r40;
        C135726l9 r0 = new C135726l9((RecyclerView) shapePickerView2.findViewById(R.id.sticker_shape_subcategories_recyclerview), this.A0H, this.A0Q, r15);
        this.A0U = r0;
        this.A03 = r0;
        r0.A01 = true;
        r0.A00();
        C125426Hz r43 = new C125426Hz(this.A05, this);
        this.A0M = r43;
        this.A0Q.A0q(r43);
        this.A0Q.setItemAnimator((AnonymousClass0UY) null);
        C86604Kt.A1N(r11, this.A0P.A01, this, 269);
        C86604Kt.A1N(r11, this.A0P.A00, this, 270);
        C86604Kt.A1N(r11, this.A0P.A02, this, 271);
        AnonymousClass6H6 r02 = this.A0P;
        C32741rX r16 = new C32741rX(r02.A01, r02.A02, r02.A00, r20, r15);
        this.A02 = r16;
        r16.A00 = this.A0P;
        r1.BkL(r16, new Void[0]);
        C86604Kt.A1N(r11, this.A0O.A03, this, 272);
        C86604Kt.A1N(r11, this.A0O.A01, this, 273);
        this.A0O.A02.A0B(r11, new AnonymousClass6C6(this, 254));
        C86604Kt.A1N(r11, this.A0O.A00, this, 274);
        this.A0N = new AnonymousClass7XM(activity2, this.A07, r11, r12, r23, r22, r9, this.A0Z);
        C86604Kt.A1N(r11, this.A0Z, this, 275);
        shapePickerView2.findViewById(R.id.shape_picker_header_background).setVisibility(0);
        this.A08.setVisibility(8);
        this.A0Q.setClipToPadding(true);
        this.A0Q.A0o(new C125376Hu(this, this.A05.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), this.A05.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), r23.A0U()));
        r7.A06(this.A0W);
        HandlerThread handlerThread = new HandlerThread("Shapes Thread", 1);
        this.A06 = handlerThread;
        this.A0L = new C124766Du(activity2, AnonymousClass6C9.A0S(handlerThread), this);
        this.A0K = new C124716Dp(activity2.getMainLooper(), this);
        int dimensionPixelSize = this.A05.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        for (int min = Math.min(((AnonymousClass000.A0B(this.A05).widthPixels * AnonymousClass000.A0B(this.A05).heightPixels) / (dimensionPixelSize * dimensionPixelSize)) + 1, AnonymousClass002.A04(A002, 1)); min >= 0; min--) {
            Message obtain = Message.obtain(this.A0L, 0, 0, 0, (Object) null);
            String BDW = ((C85164Fe) A002.get(min)).BDW();
            Bundle A082 = AnonymousClass002.A08();
            A082.putString("tag_bundle_key", BDW);
            obtain.setData(A082);
            obtain.sendToTarget();
        }
    }
}
