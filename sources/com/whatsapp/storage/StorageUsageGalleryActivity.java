package com.whatsapp.storage;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0QU;
import X.AnonymousClass0R2;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass29a;
import X.AnonymousClass2z0;
import X.AnonymousClass319;
import X.AnonymousClass35V;
import X.AnonymousClass35X;
import X.AnonymousClass3ZH;
import X.AnonymousClass4EC;
import X.AnonymousClass4FV;
import X.AnonymousClass4FW;
import X.AnonymousClass4SG;
import X.AnonymousClass5M7;
import X.AnonymousClass5QO;
import X.AnonymousClass5R7;
import X.AnonymousClass5RO;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZU;
import X.AnonymousClass657;
import X.AnonymousClass677;
import X.AnonymousClass679;
import X.AnonymousClass685;
import X.C001902e;
import X.C06270Wx;
import X.C06560Yg;
import X.C08240dc;
import X.C101215Dx;
import X.C101895Gr;
import X.C105365Uq;
import X.C106195Xz;
import X.C106405Yw;
import X.C107295b4;
import X.C107395bF;
import X.C107525bS;
import X.C114015mM;
import X.C117635sF;
import X.C1236269d;
import X.C124166Bf;
import X.C15910sA;
import X.C16910uE;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C29431io;
import X.C47052cd;
import X.C55832qz;
import X.C60302yK;
import X.C620633i;
import X.C620733j;
import X.C624134x;
import X.C626936e;
import X.C64773Ex;
import X.C66543Lv;
import X.C69263Wi;
import X.C86614Ku;
import X.C86634Kw;
import X.C86664Kz;
import X.C88834as;
import X.C89554de;
import X.C93594or;
import X.C93684p0;
import X.C93764pG;
import X.C95814uZ;
import X.C991454p;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class StorageUsageGalleryActivity extends C89554de implements AnonymousClass677 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public ViewGroup A04;
    public C16910uE A05;
    public AnonymousClass0R2 A06;
    public AnonymousClass0QU A07;
    public C101215Dx A08;
    public C64773Ex A09;
    public AnonymousClass5ZU A0A;
    public C105365Uq A0B;
    public C114015mM A0C;
    public AnonymousClass5R7 A0D;
    public AnonymousClass5QO A0E;
    public C66543Lv A0F;
    public C991454p A0G;
    public AnonymousClass319 A0H;
    public C29431io A0I;
    public C60302yK A0J;
    public AnonymousClass3ZH A0K;
    public ProgressDialogFragment A0L;
    public AnonymousClass4FV A0M;
    public C95814uZ A0N;
    public C106195Xz A0O;
    public StorageUsageMediaGalleryFragment A0P;
    public C93764pG A0Q;
    public C55832qz A0R;
    public Runnable A0S;
    public Runnable A0T;
    public String A0U;
    public final Handler A0V = AnonymousClass000.A0A();
    public final AnonymousClass657 A0W = new C107525bS(this, 4);
    public final AnonymousClass4FW A0X = new C124166Bf(this, 25);
    public final AnonymousClass4EC A0Y = new AnonymousClass29a(this, 1);
    public final Runnable A0Z = new C117635sF(this, 37);
    public final Runnable A0a = new C117635sF(this, 38);

    public boolean A64() {
        return true;
    }

    public final void A74() {
        Handler handler = this.A0V;
        handler.removeCallbacks(this.A0a);
        Runnable runnable = this.A0T;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
            this.A0T = null;
        }
        ProgressDialogFragment progressDialogFragment = this.A0L;
        if (progressDialogFragment != null) {
            progressDialogFragment.A1L();
            this.A0L = null;
        }
        C991454p r1 = this.A0G;
        if (r1 != null) {
            r1.A0D(true);
            this.A0G = null;
        }
        AnonymousClass0QU r0 = this.A07;
        if (r0 != null) {
            r0.A01();
            this.A07 = null;
        }
    }

    public final void A75() {
        int i;
        TextView A0G2 = C18300x5.A0G(this.A04, R.id.storage_usage_detail_all_size);
        long j = this.A03;
        if (j >= 0) {
            A0G2.setText(AnonymousClass35V.A05(this.A00, Math.max(j - this.A02, 0)));
            i = 0;
        } else {
            i = 8;
        }
        A0G2.setVisibility(i);
    }

    public final void A76() {
        AnonymousClass5QO r1;
        AnonymousClass0R2 r2 = this.A06;
        if (r2 != null && (r1 = this.A0E) != null) {
            if (r1.A04.isEmpty()) {
                r2.A05();
                return;
            }
            C620633i r7 = this.A08;
            C620733j r6 = this.A00;
            HashMap hashMap = r1.A04;
            long size = (long) hashMap.size();
            Object[] A0L2 = AnonymousClass002.A0L();
            AnonymousClass000.A1L(A0L2, hashMap.size());
            C107295b4.A00(this, r7, r6.A0L(A0L2, R.plurals.f9nameremoved, size));
            this.A06.A06();
        }
    }

    public void Awx(Drawable drawable, View view) {
    }

    public void B3M() {
        AnonymousClass0R2 r0 = this.A06;
        if (r0 != null) {
            r0.A05();
        }
    }

    public Object B5x(Class cls) {
        if (cls == AnonymousClass657.class) {
            return this.A0W;
        }
        return null;
    }

    public boolean BFW() {
        return AnonymousClass000.A1W(this.A0E);
    }

    public /* synthetic */ boolean BIA() {
        return false;
    }

    public boolean BIB(C624134x r3) {
        AnonymousClass5QO r0 = this.A0E;
        if (r0 != null) {
            if (!r0.A04.containsKey(r3.A1J)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean BIT() {
        return false;
    }

    public /* synthetic */ boolean BLE() {
        return true;
    }

    public /* synthetic */ void BZx(C624134x r1, boolean z) {
    }

    public /* synthetic */ void Bmp(C624134x r1, int i) {
    }

    public void BnL(List list, boolean z) {
        if (this.A0E == null) {
            this.A0E = new AnonymousClass5QO(this.A05, new C1236269d(this, 2), (AnonymousClass5QO) null, this.A0I);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x A0T2 = C18300x5.A0T(it);
            AnonymousClass5QO r0 = this.A0E;
            AnonymousClass2z0 r1 = A0T2.A1J;
            HashMap hashMap = r0.A04;
            if (z) {
                hashMap.put(r1, A0T2);
            } else {
                hashMap.remove(r1);
            }
        }
        A76();
    }

    public /* synthetic */ boolean BoV() {
        return false;
    }

    public /* synthetic */ boolean Bor() {
        return false;
    }

    public void Bpx(C624134x r9) {
        C69263Wi r4 = this.A05;
        C29431io r3 = this.A0I;
        AnonymousClass5QO r0 = new AnonymousClass5QO(r4, new C1236269d(this, 2), this.A0E, r3);
        this.A0E = r0;
        r0.A04.put(r9.A1J, r9);
        this.A06 = Bpz(this.A05);
        C620633i r7 = this.A08;
        C620733j r6 = this.A00;
        AnonymousClass5QO r42 = this.A0E;
        long size = (long) r42.A04.size();
        Object[] A0L2 = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L2, r42.A04.size());
        C107295b4.A00(this, r7, r6.A0L(A0L2, R.plurals.f9nameremoved, size));
    }

    public boolean Bqw(C624134x r6) {
        AnonymousClass5QO r4 = this.A0E;
        if (r4 == null) {
            r4 = new AnonymousClass5QO(this.A05, new C1236269d(this, 2), (AnonymousClass5QO) null, this.A0I);
            this.A0E = r4;
        }
        AnonymousClass2z0 r2 = r6.A1J;
        boolean containsKey = r4.A04.containsKey(r2);
        HashMap hashMap = this.A0E.A04;
        if (containsKey) {
            hashMap.remove(r2);
        } else {
            hashMap.put(r2, r6);
        }
        A76();
        return !containsKey;
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public AnonymousClass679 getConversationRowCustomizer() {
        return this.A0D.A08;
    }

    public /* synthetic */ C06270Wx getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ C06270Wx getLastMessageLiveData() {
        return null;
    }

    public C15910sA getLifecycleOwner() {
        return this;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public void onBackPressed() {
        long j = this.A02;
        if (j >= 0) {
            if (j > this.A03) {
                Log.e("Deleted media size is greater than the total media size");
            }
            Intent A072 = C18320x8.A07();
            C95814uZ r1 = this.A0N;
            if (r1 != null) {
                AnonymousClass0x2.A0u(A072, r1, "jid");
            }
            A072.putExtra("gallery_type", this.A01);
            A072.putExtra("memory_size", Math.max(this.A03 - this.A02, 0));
            A072.putExtra("deleted_size", this.A02);
            setResult(1, A072);
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        A6N();
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass5Y0 r3 = this.A0C;
        C64773Ex r10 = this.A09;
        AnonymousClass5ZU r11 = this.A0A;
        C620733j r15 = this.A00;
        C101215Dx r2 = this.A08;
        C88834as r0 = r2.A00.A01;
        this.A05 = new AnonymousClass685(this, r10, r11, new AnonymousClass5RO(), new C93684p0((AnonymousClass5M7) r2.A00.A01.A0T.get(), this, new C93764pG(r0.ABv(), new C93594or((C47052cd) r0.A4Z.A00.A7Z.get()))), this.A0Q, r15, r3, this, 6);
        this.A0B = this.A0C.A06(this, "storage-usage-gallery-activity");
        int intExtra = getIntent().getIntExtra("gallery_type", 0);
        this.A01 = intExtra;
        if (intExtra == 0) {
            C95814uZ A002 = C106405Yw.A00(this);
            C626936e.A06(A002);
            this.A0N = A002;
            this.A0K = this.A09.A07(A002);
        }
        this.A03 = getIntent().getLongExtra("memory_size", 0);
        this.A0U = getIntent().getStringExtra("session_id");
        this.A00 = getIntent().getIntExtra("entry_point", 0);
        String str = null;
        if (bundle == null) {
            C101895Gr r1 = new C101895Gr();
            r1.A00 = this.A01;
            C95814uZ r02 = this.A0N;
            if (r02 != null) {
                str = r02.getRawString();
            }
            int i = r1.A00;
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = new StorageUsageMediaGalleryFragment();
            Bundle A082 = AnonymousClass002.A08();
            A082.putInt("storage_media_gallery_fragment_gallery_type", i);
            A082.putString("storage_media_gallery_fragment_jid", str);
            A082.putInt("sort_type", 2);
            storageUsageMediaGalleryFragment.A0u(A082);
            this.A0P = storageUsageMediaGalleryFragment;
            C08240dc A0J2 = AnonymousClass0x2.A0J(this);
            A0J2.A0D(this.A0P, "storage_usage_gallery_fragment_tag", R.id.storage_usage_gallery_container);
            A0J2.A01();
            this.A02 = 0;
        } else {
            this.A0P = (StorageUsageMediaGalleryFragment) getSupportFragmentManager().A0D("storage_usage_gallery_fragment_tag");
            List<AnonymousClass2z0> A042 = C107395bF.A04(bundle2);
            if (A042 != null) {
                for (AnonymousClass2z0 r6 : A042) {
                    C624134x A052 = this.A0R.A05(r6);
                    if (A052 != null) {
                        AnonymousClass5QO r22 = this.A0E;
                        if (r22 == null) {
                            r22 = new AnonymousClass5QO(this.A05, new C1236269d(this, 2), (AnonymousClass5QO) null, this.A0I);
                            this.A0E = r22;
                        }
                        r22.A04.put(r6, A052);
                    }
                }
                if (this.A0E != null) {
                    this.A06 = Bpz(this.A05);
                }
            }
            this.A02 = bundle2.getLong("deleted_size");
        }
        C60302yK r03 = this.A0J;
        r03.A0A.add(this.A0Y);
        this.A0I.A06(this.A0X);
        AnonymousClass0R8 A0R2 = C86634Kw.A0R(this);
        A0R2.A0N(false);
        A0R2.A0Q(false);
        AnonymousClass4SG.A2T(this).A07();
        View A0g = C86664Kz.A0g(LayoutInflater.from(this), R.layout.f8nameremoved);
        C626936e.A04(A0g);
        ViewGroup viewGroup = (ViewGroup) A0g;
        this.A04 = viewGroup;
        ImageView A0E2 = AnonymousClass0x9.A0E(viewGroup, R.id.storage_usage_back_button);
        C18280x3.A0o(A0E2, this, 20);
        boolean A043 = C620733j.A04(this.A00);
        int i2 = R.drawable.ic_back_rtl;
        if (A043) {
            i2 = R.drawable.ic_back;
        }
        A0E2.setImageResource(i2);
        View A022 = C06560Yg.A02(this.A04, R.id.storage_usage_sort_button);
        A022.setVisibility(0);
        C18280x3.A0o(A022, this, 21);
        A0R2.A0O(true);
        A0R2.A0H(this.A04, new C001902e(-1, -1));
        TextEmojiLabel A0K2 = AnonymousClass0x7.A0K(this.A04, R.id.storage_usage_detail_name);
        View A023 = C06560Yg.A02(this.A04, R.id.storage_usage_contact_photo_container);
        ImageView A0E3 = AnonymousClass0x9.A0E(this.A04, R.id.storage_usage_contact_photo);
        int i3 = this.A01;
        if (i3 == 2) {
            A0K2.setText(AnonymousClass35X.A04(this, this.A00));
        } else if (i3 == 1) {
            A0K2.setText(R.string.f11nameremoved);
        } else {
            if (i3 == 0) {
                AnonymousClass5ZU r12 = this.A0A;
                AnonymousClass3ZH r04 = this.A0K;
                C626936e.A06(r04);
                A0K2.A0K((List) null, r12.A0H(r04));
                A023.setVisibility(0);
                this.A0B.A08(A0E3, this.A0K);
            }
            A75();
            AnonymousClass4SG.A3d(this);
        }
        A023.setVisibility(8);
        A75();
        AnonymousClass4SG.A3d(this);
    }

    public /* synthetic */ void B3X(C624134x r1) {
    }

    public /* synthetic */ int BAS(C624134x r2) {
        return 1;
    }

    public /* synthetic */ boolean BJC(C624134x r2) {
        return false;
    }

    public /* synthetic */ void Bkv(C624134x r1) {
    }

    public /* synthetic */ void Boi(C624134x r1) {
    }

    public /* synthetic */ void Brx(C624134x r1) {
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass5QO r0 = this.A0E;
        if (r0 != null) {
            r0.A01();
            this.A0E = null;
        }
        this.A0P = null;
        C60302yK r02 = this.A0J;
        r02.A0A.remove(this.A0Y);
        this.A0V.removeCallbacks((Runnable) null);
        A74();
        this.A0I.A07(this.A0X);
        C105365Uq r03 = this.A0B;
        if (r03 != null) {
            r03.A00();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass5QO r0 = this.A0E;
        if (r0 != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator A10 = C18290x4.A10(r0.A04);
            while (A10.hasNext()) {
                A0s.add(C86614Ku.A0h(A10));
            }
            C107395bF.A09(bundle, A0s);
        }
        bundle.putLong("deleted_size", this.A02);
    }

    public /* synthetic */ void setQuotedMessage(C624134x r1) {
    }

    public int A5t() {
        return 78318969;
    }

    public void BpB(View view, C624134x r2, int i, boolean z) {
    }
}
