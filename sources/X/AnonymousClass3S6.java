package X;

import com.whatsapp.util.Log;

/* renamed from: X.3S6  reason: invalid class name */
public final class AnonymousClass3S6 implements C1229366k {
    public final AnonymousClass4GP A00;
    public final AnonymousClass4GP A01;

    public AnonymousClass3S6(AnonymousClass4GP r2, AnonymousClass4GP r3) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
        this.A00 = r3;
    }

    public void BXB() {
        Log.d("GenAIDisclosureCallback/onNoEligibleDisclosure Disclosure Not Eligible");
        this.A00.invoke();
    }

    public void BZv(AnonymousClass58O r2) {
        Log.d("GenAIDisclosureCallback/onRenderingFailed Disclosure Rendering Failed");
        this.A00.invoke();
    }

    public void Bf5() {
        Log.d("GenAIDisclosureCallback/onUserAcknowledged onUserApprovedDisclosure Acknowledged");
        this.A01.invoke();
    }

    public void Bf6() {
        Log.d("GenAIDisclosureCallback/onUserApproved Disclosure Approved");
        this.A01.invoke();
    }

    public void Bf7() {
        Log.d("GenAIDisclosureCallback/onUserDenied Disclosure Denied");
    }

    public void Bf9() {
        Log.d("GenAIDisclosureCallback/onUserDismissed Disclosure Dismissed");
    }
}
