package com.whatsapp.storage;

import X.AnonymousClass001;
import X.AnonymousClass2z0;
import X.AnonymousClass4FS;
import X.AnonymousClass5IX;
import X.AnonymousClass6BW;
import X.C08270df;
import X.C08310eF;
import X.C103855Or;
import X.C1226765h;
import X.C1235268t;
import X.C18300x5;
import X.C18320x8;
import X.C19340zH;
import X.C621033m;
import X.C624134x;
import X.C85804Hr;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StorageUsageDeleteMessagesDialogFragment extends Hilt_StorageUsageDeleteMessagesDialogFragment {
    public C621033m A00;
    public C1226765h A01;
    public AnonymousClass4FS A02;
    public Collection A03;
    public Collection A04;
    public boolean A05;
    public boolean A06;

    public static StorageUsageDeleteMessagesDialogFragment A00(C1226765h r5, Collection collection, Collection collection2) {
        StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = new StorageUsageDeleteMessagesDialogFragment();
        storageUsageDeleteMessagesDialogFragment.A04 = collection;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (!AnonymousClass2z0.A0B(A0T)) {
                A0s.add(A0T);
            }
        }
        storageUsageDeleteMessagesDialogFragment.A03 = A0s;
        storageUsageDeleteMessagesDialogFragment.A01 = r5;
        return storageUsageDeleteMessagesDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        boolean z;
        boolean z2;
        int i;
        String str;
        AnonymousClass6BW r4;
        Iterator it = this.A04.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C18300x5.A0T(it).A1F) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        Iterator it2 = this.A03.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (C18300x5.A0T(it2).A1F) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z) {
            int size = this.A04.size();
            i = R.string.f11nameremoved;
            if (size == 1) {
                i = R.string.f11nameremoved;
            }
        } else if (z2 || this.A03.size() <= this.A04.size()) {
            int size2 = this.A04.size();
            i = R.string.f11nameremoved;
            if (size2 == 1) {
                i = R.string.f11nameremoved;
            }
        } else {
            int size3 = this.A04.size();
            i = R.string.f11nameremoved;
            if (size3 == 1) {
                i = R.string.f11nameremoved;
            }
        }
        String string = C08310eF.A09(this).getString(i);
        C103855Or r6 = new C103855Or(A1D());
        int size4 = this.A04.size();
        int i2 = R.string.f11nameremoved;
        if (size4 == 1) {
            i2 = R.string.f11nameremoved;
        }
        r6.A06 = C08310eF.A09(this).getString(i2);
        r6.A05 = string;
        if (z) {
            if (this.A04.size() == 1) {
                this.A06 = true;
            } else {
                str = C08310eF.A09(this).getString(R.string.f11nameremoved);
                r4 = new AnonymousClass6BW(this, 0);
                r6.A08.add(new AnonymousClass5IX(r4, str, false));
            }
        } else if (!z2 && this.A03.size() > this.A04.size()) {
            str = C08310eF.A09(this).getString(R.string.f11nameremoved);
            r4 = new AnonymousClass6BW(this, 1);
            r6.A08.add(new AnonymousClass5IX(r4, str, false));
        }
        C85804Hr r1 = new C85804Hr(this, 103);
        C19340zH A0H = C18320x8.A0H(this);
        A0H.A0a(r6.A00());
        A0H.A0Y(r1, R.string.f11nameremoved);
        A0H.A0W(new C1235268t(this, 133), R.string.f11nameremoved);
        A0H.A0i(true);
        return A0H.create();
    }

    public void A1O(C08270df r1, String str) {
        C18300x5.A1B(this, r1, str);
    }
}
