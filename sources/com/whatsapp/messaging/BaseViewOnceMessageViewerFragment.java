package com.whatsapp.messaging;

import X.AnonymousClass2z0;
import X.AnonymousClass3LQ;
import X.AnonymousClass4DU;
import X.AnonymousClass5R7;
import X.AnonymousClass677;
import X.AnonymousClass679;
import X.C06270Wx;
import X.C107395bF;
import X.C15910sA;
import X.C41532Kp;
import X.C55832qz;
import X.C624134x;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.ephemeral.ViewOnceNuxBottomSheet;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class BaseViewOnceMessageViewerFragment extends Hilt_BaseViewOnceMessageViewerFragment implements AnonymousClass677 {
    public AnonymousClass5R7 A00;
    public AnonymousClass3LQ A01;
    public C624134x A02;
    public C55832qz A03;

    public /* synthetic */ void Awx(Drawable drawable, View view) {
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

    public /* synthetic */ void BZx(C624134x r1, boolean z) {
    }

    public /* synthetic */ void Bmp(C624134x r1, int i) {
    }

    public /* synthetic */ void BnL(List list, boolean z) {
    }

    public /* synthetic */ boolean BoV() {
        return false;
    }

    public /* synthetic */ boolean Bor() {
        return false;
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public AnonymousClass679 getConversationRowCustomizer() {
        return this.A00.A08;
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

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        AnonymousClass2z0 A032 = C107395bF.A03(A0H(), "");
        Objects.requireNonNull(A032);
        A032.getClass();
        C624134x A05 = this.A03.A05(A032);
        Objects.requireNonNull(A05);
        this.A02 = A05;
        ViewOnceNuxBottomSheet.A01(A0U(), (C41532Kp) null, this.A01, (C624134x) ((AnonymousClass4DU) A05));
    }

    public /* synthetic */ void B3X(C624134x r1) {
    }

    public /* synthetic */ Object B5x(Class cls) {
        return null;
    }

    public /* synthetic */ int BAS(C624134x r2) {
        return 1;
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

    public /* synthetic */ void setQuotedMessage(C624134x r1) {
    }

    public void BpB(View view, C624134x r2, int i, boolean z) {
    }
}
