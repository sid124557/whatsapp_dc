package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3F5  reason: invalid class name */
public final class AnonymousClass3F5 implements AnonymousClass677 {
    public final Map A00 = C18320x8.A0r();
    public final /* synthetic */ C94084pr A01;

    public int BAS(C624134x r3) {
        C162457s7.A0J(r3, 0);
        Number A0q = AnonymousClass0x9.A0q(r3.A1J, this.A00);
        if (A0q != null) {
            return A0q.intValue();
        }
        return 1;
    }

    public void Bmp(C624134x r3, int i) {
        C162457s7.A0J(r3, 0);
        Map map = this.A00;
        AnonymousClass2z0 r0 = r3.A1J;
        C162457s7.A0C(r0);
        C18280x3.A1D(r0, map, i);
    }

    public AnonymousClass3F5(C94084pr r2) {
        this.A01 = r2;
    }

    public /* synthetic */ void B3X(C624134x r1) {
    }

    public /* synthetic */ Object B5x(Class cls) {
        return null;
    }

    public /* synthetic */ boolean BIB(C624134x r2) {
        return false;
    }

    public /* synthetic */ boolean BJC(C624134x r2) {
        return false;
    }

    public /* synthetic */ void Bkv(C624134x r1) {
    }

    public /* synthetic */ void Boi(C624134x r1) {
    }

    public /* synthetic */ void Bpx(C624134x r1) {
    }

    public /* synthetic */ boolean Bqw(C624134x r2) {
        return false;
    }

    public /* synthetic */ void Brx(C624134x r1) {
    }

    public AnonymousClass679 getConversationRowCustomizer() {
        C94084pr r0 = this.A01;
        AnonymousClass5R7 r1 = r0.A05;
        if (r1 != null) {
            return r1.A00(AnonymousClass0x2.A09(r0.A08));
        }
        throw C18270x1.A0S("conversationRowCustomizers");
    }

    public /* synthetic */ void setQuotedMessage(C624134x r1) {
    }

    public /* synthetic */ void B3M() {
    }

    public /* synthetic */ boolean BFW() {
        return false;
    }

    public /* synthetic */ boolean BIA() {
        return false;
    }

    public /* synthetic */ boolean BIT() {
        return false;
    }

    public /* synthetic */ boolean BLE() {
        return true;
    }

    public /* synthetic */ boolean BoV() {
        return false;
    }

    public /* synthetic */ boolean Bor() {
        return false;
    }

    public int getContainerType() {
        return 5;
    }

    public /* synthetic */ C06270Wx getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ C06270Wx getLastMessageLiveData() {
        return null;
    }

    public C15910sA getLifecycleOwner() {
        return this.A01;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public void BpB(View view, C624134x r2, int i, boolean z) {
    }

    public /* synthetic */ void Awx(Drawable drawable, View view) {
    }

    public /* synthetic */ void BZx(C624134x r1, boolean z) {
    }

    public /* synthetic */ void BnL(List list, boolean z) {
    }
}
