package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4oN  reason: invalid class name and case insensitive filesystem */
public abstract class C93354oN extends C89454d0 implements AnonymousClass677, C1230666y, AnonymousClass652 {
    public C112975kg A00;
    public List A01 = AnonymousClass001.A0s();

    public /* synthetic */ void Awx(Drawable drawable, View view) {
    }

    public C835748y B0u() {
        return new C111305hs(this.A00);
    }

    public void B1t() {
        AnonymousClass4Rl r0 = this.A00.A0P;
        if (r0 != null) {
            r0.dismiss();
        }
    }

    public void B3M() {
        this.A00.B3M();
    }

    public void B3X(C624134x r2) {
        this.A00.B3X(r2);
    }

    public Object B5x(Class cls) {
        return this.A00.B5x(cls);
    }

    public int BAS(C624134x r2) {
        return this.A00.BAS(r2);
    }

    public boolean BFW() {
        return this.A00.BFW();
    }

    public void BFc() {
    }

    public /* synthetic */ boolean BIA() {
        return false;
    }

    public boolean BIB(C624134x r2) {
        return this.A00.BIB(r2);
    }

    public /* synthetic */ boolean BIT() {
        return false;
    }

    public boolean BIc() {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A00.A0v;
        if (reactionsTrayViewModel == null || C86604Kt.A05(reactionsTrayViewModel.A0C) != 2) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean BLE() {
        return true;
    }

    public void BZO(int i) {
        this.A00.A0A(i);
    }

    public /* synthetic */ void BZx(C624134x r1, boolean z) {
    }

    public void Bkv(C624134x r2) {
        this.A00.Bkv(r2);
    }

    public void Bmp(C624134x r2, int i) {
        this.A00.Bmp(r2, i);
    }

    public void BnL(List list, boolean z) {
        this.A00.BnL(list, z);
    }

    public /* synthetic */ boolean BoV() {
        return false;
    }

    public void Boh(Bitmap bitmap, C106705a1 r3) {
        this.A00.Boh(bitmap, r3);
    }

    public /* synthetic */ boolean Bor() {
        return false;
    }

    public void BpB(View view, C624134x r3, int i, boolean z) {
        this.A00.BpB(view, r3, i, z);
    }

    public void Bpx(C624134x r2) {
        this.A00.Bpx(r2);
    }

    public boolean Bqw(C624134x r2) {
        return this.A00.Bqw(r2);
    }

    public void Brx(C624134x r2) {
        this.A00.Brx(r2);
    }

    public AnonymousClass1VX getABProps() {
        return this.A0D;
    }

    public C89644eZ getActivity() {
        return this;
    }

    public /* synthetic */ int getContainerType() {
        return 6;
    }

    public C89224c7 getEmojiPopupWindow() {
        return null;
    }

    public /* synthetic */ C06270Wx getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ C06270Wx getLastMessageLiveData() {
        return null;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public C15940sD getViewModelStoreOwner() {
        return this;
    }

    public void onCreate(Bundle bundle) {
        if (this.A00 == null) {
            C112975kg r0 = new C112975kg();
            ((C88834as) ((AnonymousClass3DZ) AnonymousClass29x.A00(AnonymousClass3DZ.class, this))).ADd(r0);
            this.A00 = r0;
            r0.A0N = this;
            List list = this.A01;
            if (0 < list.size()) {
                list.get(0);
                throw AnonymousClass001.A0g("onCreate");
            }
        }
        super.onCreate(bundle);
        this.A00.A05();
    }

    public Dialog onCreateDialog(int i) {
        return this.A00.A02(i);
    }

    public void onDestroy() {
        this.A00.A06();
        this.A01.clear();
    }

    public /* synthetic */ boolean BJC(C624134x r2) {
        return false;
    }

    public Dialog BdX(int i) {
        return super.onCreateDialog(i);
    }

    public void Bdh(AnonymousClass0R2 r3) {
        super.Bdh(r3);
        C112975kg r0 = this.A00;
        C107405bG.A07(C112975kg.A00(r0), AnonymousClass34K.A00(C112975kg.A00(r0)));
    }

    public void Bdi(AnonymousClass0R2 r2) {
        super.Bdi(r2);
        this.A00.A08();
    }

    public /* synthetic */ void Boi(C624134x r1) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A00.A0B(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A00.A0C(configuration);
    }

    public void onPause() {
        super.onPause();
        this.A00.A07();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        AnonymousClass2z0 A03;
        super.onRestoreInstanceState(bundle);
        C112975kg r2 = this.A00;
        r2.A09();
        if (bundle != null && (A03 = C107395bF.A03(bundle, "")) != null) {
            r2.A0s = r2.A0y.A05(A03);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C624134x r0 = this.A00.A0s;
        if (r0 != null) {
            C107395bF.A07(bundle, r0.A1J);
        }
    }

    public /* synthetic */ void setQuotedMessage(C624134x r1) {
    }

    public void BdZ() {
        super.onDestroy();
    }
}
