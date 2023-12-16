package com.whatsapp.community;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0QY;
import X.AnonymousClass0x2;
import X.AnonymousClass11H;
import X.AnonymousClass1R1;
import X.AnonymousClass1VX;
import X.AnonymousClass2R8;
import X.AnonymousClass33U;
import X.AnonymousClass33p;
import X.AnonymousClass34R;
import X.AnonymousClass3LP;
import X.AnonymousClass4FS;
import X.AnonymousClass4X0;
import X.AnonymousClass4ZM;
import X.AnonymousClass5UX;
import X.AnonymousClass5ZU;
import X.AnonymousClass64B;
import X.AnonymousClass7HP;
import X.AnonymousClass9U4;
import X.C012109p;
import X.C06560Yg;
import X.C08510eb;
import X.C100385As;
import X.C103145Ls;
import X.C105365Uq;
import X.C105965Xc;
import X.C106195Xz;
import X.C113445lR;
import X.C114015mM;
import X.C116985rC;
import X.C18300x5;
import X.C18320x8;
import X.C183538qC;
import X.C1907099n;
import X.C195219Wq;
import X.C27991fJ;
import X.C39542Cj;
import X.C40532Gt;
import X.C43642Sx;
import X.C46962cU;
import X.C50222hp;
import X.C52472lX;
import X.C53582nK;
import X.C54292oU;
import X.C56072rN;
import X.C56152rV;
import X.C56322rn;
import X.C56542sA;
import X.C56612sH;
import X.C56722sS;
import X.C56762sW;
import X.C56892sj;
import X.C56942so;
import X.C56962sq;
import X.C56972sr;
import X.C56982ss;
import X.C620333f;
import X.C620633i;
import X.C620733j;
import X.C625735q;
import X.C626936e;
import X.C64653Ej;
import X.C64773Ex;
import X.C69263Wi;
import X.C71653cS;
import X.C86654Ky;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.lang.reflect.Array;
import java.util.HashSet;

public class CommunitySubgroupsBottomSheet extends Hilt_CommunitySubgroupsBottomSheet implements AnonymousClass64B {
    public AnonymousClass0QY A00;
    public C116985rC A01;
    public C116985rC A02;
    public C53582nK A03;
    public C103145Ls A04;
    public C39542Cj A05;
    public C69263Wi A06;
    public C56972sr A07;
    public C625735q A08;
    public C56962sq A09;
    public C56722sS A0A;
    public C56942so A0B;
    public C64653Ej A0C;
    public C113445lR A0D;
    public AnonymousClass33U A0E;
    public AnonymousClass5UX A0F;
    public C64773Ex A0G;
    public AnonymousClass5ZU A0H;
    public C105365Uq A0I;
    public C114015mM A0J;
    public C620633i A0K;
    public C56612sH A0L;
    public C54292oU A0M;
    public AnonymousClass33p A0N;
    public C620733j A0O;
    public C56762sW A0P;
    public C56542sA A0Q;
    public C56982ss A0R;
    public C46962cU A0S;
    public C56892sj A0T;
    public C56322rn A0U;
    public C56152rV A0V;
    public C620333f A0W;
    public AnonymousClass2R8 A0X;
    public AnonymousClass1VX A0Y;
    public AnonymousClass3LP A0Z;
    public C52472lX A0a;
    public C40532Gt A0b;
    public C43642Sx A0c;
    public C106195Xz A0d;
    public C1907099n A0e;
    public AnonymousClass9U4 A0f;
    public C195219Wq A0g;
    public C50222hp A0h;
    public AnonymousClass1R1 A0i;
    public C56072rN A0j;
    public AnonymousClass4FS A0k;
    public C183538qC A0l;

    public void A0w(Bundle bundle, View view) {
        View view2 = view;
        super.A0w(bundle, view2);
        C27991fJ A042 = AnonymousClass34R.A04(A0H().getString("extra_community_jid"));
        C626936e.A06(A042);
        this.A0D = this.A04.A00(A0R(), new C71653cS(this, 41, A042), new C71653cS(this, 42, A042));
        AnonymousClass0x2.A0z(C06560Yg.A02(view2, R.id.switch_subgroup_bottom_sheet_close_button), this, 32);
        C18300x5.A0G(view2, R.id.community_name).setText(this.A0H.A0H(this.A0G.A0A(A042)));
        this.A0I = this.A0J.A06(A0G(), "add-groups-to-community");
        RecyclerView A0P2 = C86654Ky.A0P(view2, R.id.recycler_view);
        A0G();
        C18320x8.A19(A0P2, 1);
        AnonymousClass4X0 r3 = new AnonymousClass4X0(this, A042);
        this.A00 = new AnonymousClass0QY(new AnonymousClass4ZM(r3, this.A0R), AnonymousClass7HP.class);
        A0P2.setAdapter(r3);
        HashSet A0K2 = AnonymousClass002.A0K();
        if (this.A0B.A0F(A042)) {
            A0K2.add(new AnonymousClass7HP(0, (Object) null));
        }
        A0K2.add(new AnonymousClass7HP(2, (Object) null));
        AnonymousClass0QY r7 = this.A00;
        Class cls = r7.A08;
        Object[] array = A0K2.toArray((Object[]) Array.newInstance(cls, A0K2.size()));
        r7.A03();
        if (array.length != 0) {
            int A002 = r7.A00(array);
            int i = r7.A03;
            if (i == 0) {
                r7.A06 = array;
                r7.A03 = A002;
                r7.A05.BUd(0, A002);
            } else {
                C08510eb r1 = r7.A05;
                boolean z = r1 instanceof C012109p;
                boolean z2 = !z;
                if (z2) {
                    r7.A03();
                    if (!z) {
                        C012109p r0 = r7.A04;
                        if (r0 == null) {
                            r0 = new C012109p(r1);
                            r7.A04 = r0;
                        }
                        r7.A05 = r0;
                    }
                }
                r7.A07 = r7.A06;
                int i2 = 0;
                r7.A02 = 0;
                r7.A01 = i;
                r7.A06 = (Object[]) Array.newInstance(cls, i + A002 + 10);
                r7.A00 = 0;
                while (true) {
                    int i3 = r7.A02;
                    int i4 = r7.A01;
                    if (i3 >= i4 && i2 >= A002) {
                        break;
                    } else if (i3 == i4) {
                        int i5 = A002 - i2;
                        System.arraycopy(array, i2, r7.A06, r7.A00, i5);
                        int i6 = r7.A00 + i5;
                        r7.A00 = i6;
                        r7.A03 += i5;
                        r7.A05.BUd(i6 - i5, i5);
                        break;
                    } else if (i2 == A002) {
                        int i7 = i4 - i3;
                        System.arraycopy(r7.A07, i3, r7.A06, r7.A00, i7);
                        r7.A00 += i7;
                        break;
                    } else {
                        Object obj = r7.A07[i3];
                        Object obj2 = array[i2];
                        int compare = r7.A05.compare(obj, obj2);
                        if (compare > 0) {
                            Object[] objArr = r7.A06;
                            int i8 = r7.A00;
                            int i9 = i8 + 1;
                            r7.A00 = i9;
                            objArr[i8] = obj2;
                            r7.A03++;
                            i2++;
                            r7.A05.BUd(i9 - 1, 1);
                        } else if (compare != 0 || !r7.A05.A02(obj, obj2)) {
                            Object[] objArr2 = r7.A06;
                            int i10 = r7.A00;
                            r7.A00 = i10 + 1;
                            objArr2[i10] = obj;
                            r7.A02++;
                        } else {
                            Object[] objArr3 = r7.A06;
                            int i11 = r7.A00;
                            r7.A00 = i11 + 1;
                            objArr3[i11] = obj2;
                            i2++;
                            r7.A02++;
                            if (!r7.A05.A01(obj, obj2)) {
                                C08510eb r2 = r7.A05;
                                r2.BOg(r2.A00(obj, obj2), r7.A00 - 1, 1);
                            }
                        }
                    }
                }
                r7.A07 = null;
                if (z2) {
                    r7.A02();
                }
            }
        }
        C100385As.A00(this, AnonymousClass11H.A00(this, this.A05, new C105965Xc(true, true, false, true, true, true), A042).A0y, A042, 9);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0h() {
        super.A0h();
        C105365Uq r0 = this.A0I;
        if (r0 != null) {
            r0.A00();
        }
    }
}
