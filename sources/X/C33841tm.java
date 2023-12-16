package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1tm  reason: invalid class name and case insensitive filesystem */
public class C33841tm extends AnonymousClass5ZM {
    public AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment A00;
    public final AnonymousClass4FV A01;
    public final AnonymousClass2Qb A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final WeakReference A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i;
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.A03;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(this.A05)) {
                AnonymousClass1ZD r5 = new AnonymousClass1ZD();
                try {
                    C50262ht r0 = this.A02.A03;
                    C50612iT A002 = r0.A00(str2, str);
                    if (r0.A07.A03(str2, str)) {
                        i = 0;
                    } else {
                        r5.A00 = Boolean.valueOf(A002.A0Q);
                        r5.A02 = AnonymousClass0x9.A0m(A002.A05.size());
                        r5.A03 = AnonymousClass0x9.A0o(A002.A01 / 10, 1024);
                        r5.A01 = Boolean.TRUE;
                        AnonymousClass4FV r3 = this.A01;
                        r3.BhD(r5);
                        C25311aJ r2 = new C25311aJ();
                        Boolean bool = Boolean.FALSE;
                        r2.A02 = bool;
                        r2.A04 = C18290x4.A0a();
                        r2.A01 = Boolean.valueOf(A002.A0S);
                        r2.A00 = bool;
                        r3.BhD(r2);
                        i = 1;
                    }
                    return new AnonymousClass2MI(i, (String) null);
                } catch (Exception e) {
                    Log.e("AddThirdPartyStickerPackActivity/fetch sticker pack error:", e);
                    r5.A01 = Boolean.FALSE;
                    this.A01.BhD(r5);
                    return new AnonymousClass2MI(2, e.getMessage());
                }
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("one of the follow fields are empty. pack id:");
        A0o.append(str);
        A0o.append(",authority:");
        A0o.append(this.A03);
        A0o.append(",sticker pack name:");
        return new AnonymousClass2MI(2, AnonymousClass000.A0X(this.A05, A0o));
    }

    public void A0A() {
        C003203q r5 = (C003203q) this.A06.get();
        if (r5 != null) {
            String str = this.A04;
            String str2 = this.A03;
            String str3 = this.A05;
            Bundle A08 = AnonymousClass002.A08();
            A08.putString("sticker_pack_id", str);
            A08.putString("sticker_pack_authority", str2);
            A08.putString("sticker_pack_name", str3);
            AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = new AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment();
            addStickerPackDialogFragment.A0u(A08);
            this.A00 = addStickerPackDialogFragment;
            addStickerPackDialogFragment.A1O(r5.getSupportFragmentManager(), "add");
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass2MI r8 = (AnonymousClass2MI) obj;
        AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = this.A00;
        if (addStickerPackDialogFragment != null && !addStickerPackDialogFragment.A0Z) {
            int i = r8.A00;
            if (i == 0) {
                Object[] A0M = AnonymousClass002.A0M();
                A0M[0] = addStickerPackDialogFragment.A05;
                addStickerPackDialogFragment.A1V(8, 0, AnonymousClass0x7.A0n(addStickerPackDialogFragment, C08310eF.A09(addStickerPackDialogFragment).getString(R.string.f11nameremoved), A0M, 1, R.string.f11nameremoved), 8);
                Activity activity = (Activity) this.A06.get();
                if (activity != null) {
                    Intent A07 = C18320x8.A07();
                    A07.putExtra("already_added", true);
                    activity.setResult(-1, A07);
                }
            } else if (i == 1) {
                Object[] A0M2 = AnonymousClass002.A0M();
                A0M2[0] = addStickerPackDialogFragment.A05;
                addStickerPackDialogFragment.A1V(8, 8, AnonymousClass0x7.A0n(addStickerPackDialogFragment, C08310eF.A09(addStickerPackDialogFragment).getString(R.string.f11nameremoved), A0M2, 1, R.string.f11nameremoved), 0);
            } else {
                addStickerPackDialogFragment.A1V(8, 0, AnonymousClass0x7.A0n(addStickerPackDialogFragment, C08310eF.A09(addStickerPackDialogFragment).getString(R.string.f11nameremoved), new Object[1], 0, R.string.f11nameremoved), 8);
                Activity activity2 = (Activity) this.A06.get();
                if (activity2 != null) {
                    Intent A072 = C18320x8.A07();
                    A072.putExtra("validation_error", r8.A01);
                    activity2.setResult(0, A072);
                }
            }
        }
    }

    public C33841tm(C003203q r2, AnonymousClass4FV r3, AnonymousClass2Qb r4, String str, String str2, String str3) {
        this.A01 = r3;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A02 = r4;
        this.A06 = AnonymousClass0x9.A14(r2);
    }
}
