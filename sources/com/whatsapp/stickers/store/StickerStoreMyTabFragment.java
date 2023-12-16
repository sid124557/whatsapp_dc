package com.whatsapp.stickers.store;

import X.AnonymousClass001;
import X.AnonymousClass09T;
import X.AnonymousClass4FS;
import X.AnonymousClass52B;
import X.AnonymousClass5ZD;
import X.C18270x1;
import X.C18290x4;
import X.C34041u8;
import X.C50612iT;
import X.C54992pc;
import X.C56932sn;
import X.C85094Ex;
import X.C86634Kw;
import X.C86654Ky;
import X.C87844Wi;
import android.view.View;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StickerStoreMyTabFragment extends Hilt_StickerStoreMyTabFragment implements C85094Ex {
    public View A00;
    public AnonymousClass09T A01;
    public C54992pc A02;
    public AnonymousClass5ZD A03;
    public C34041u8 A04;
    public AnonymousClass4FS A05;
    public boolean A06;

    public void BXa() {
        this.A04 = null;
    }

    public final void A1U() {
        C18290x4.A1L(this.A04);
        C34041u8 r1 = new C34041u8(this.A0C, this);
        this.A04 = r1;
        C18270x1.A0w(r1, this.A05);
    }

    public void BXY(C50612iT r5) {
        C87844Wi r3 = this.A0E;
        if ((r3 instanceof AnonymousClass52B) && r3.A00 != null) {
            String str = r5.A0G;
            for (int i = 0; i < r3.A00.size(); i++) {
                if (str.equals(((C50612iT) r3.A00.get(i)).A0G)) {
                    r3.A00.set(i, r5);
                    r3.A06(i);
                    return;
                }
            }
        }
    }

    public void BXb(String str) {
        if (this.A0F != null) {
            for (int i = 0; i < this.A0F.size(); i++) {
                if (C86654Ky.A0d(this, i).A0G.equals(str)) {
                    this.A0F.remove(i);
                    C87844Wi r1 = this.A0E;
                    if (r1 instanceof AnonymousClass52B) {
                        r1.A00 = this.A0F;
                        r1.A05();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public void A0h() {
        super.A0h();
        List list = this.A0F;
        if (list != null && this.A06) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C86654Ky.A0d(this, i).A00 = size - i;
            }
            C56932sn r3 = this.A0C;
            List list2 = this.A0F;
            Log.d("StickerRepository/reorderMyStickerPacksAsync/begin");
            C86634Kw.A1Q(r3.A0Z, r3, list2, 15);
        }
    }

    public void BXZ(List list) {
        if (!A1T()) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C50612iT r1 = (C50612iT) it.next();
                if (!r1.A0S) {
                    A0s.add(r1);
                }
            }
            list = A0s;
        }
        this.A0F = list;
        C87844Wi r0 = this.A0E;
        if (r0 == null) {
            A1Q(new AnonymousClass52B(this, list));
            return;
        }
        r0.A00 = list;
        r0.A05();
    }
}
