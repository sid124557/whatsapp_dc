package X;

import java.io.IOException;

/* renamed from: X.5n6  reason: invalid class name and case insensitive filesystem */
public final class C114475n6 implements AnonymousClass4EN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4GQ A01;

    public void AyP(AnonymousClass2SI r6) {
        AnonymousClass5TJ r0;
        Object obj;
        AnonymousClass4GQ r2;
        C162457s7.A0J(r6, 0);
        C104915Sv r3 = (C104915Sv) r6.A03.A00;
        if (r3 == null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("MLModelMetadataGraphqlFetcher/fetch/ml model metadata not found for ");
            A0o.append("wa_bwe_pl_classifier_mobile");
            A0o.append(' ');
            C18270x1.A1F(A0o, this.A00);
            r2 = this.A01;
            obj = new AnonymousClass3Z0(new C96144vs("ML Model metadata is not found"));
        } else if (r3.A00 == 0) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("MLModelMetadataGraphqlFetcher/fetch/ml model not found for ");
            A0o2.append("wa_bwe_pl_classifier_mobile");
            A0o2.append(' ');
            C18270x1.A1F(A0o2, this.A00);
            AnonymousClass4GQ r22 = this.A01;
            String str = r3.A04;
            if (str == null) {
                str = "Model is not found";
            }
            r22.invoke(new AnonymousClass3Z9(new AnonymousClass3Z0(new C96144vs(str))));
            return;
        } else {
            AnonymousClass5SC r02 = (AnonymousClass5SC) C73723fy.A06(r3.A05, 0);
            if (r02 == null || (r0 = (AnonymousClass5TJ) C73723fy.A06(r02.A02, 0)) == null || (obj = r0.A09) == null) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("MLModelMetadataGraphqlFetcher/fetch/ml model file url not found for ");
                A0o3.append("wa_bwe_pl_classifier_mobile");
                A0o3.append(' ');
                C18270x1.A1F(A0o3, this.A00);
                AnonymousClass4GQ r23 = this.A01;
                String str2 = r3.A04;
                if (str2 == null) {
                    str2 = "Model url is missing";
                }
                r23.invoke(new AnonymousClass3Z9(new AnonymousClass3Z0(new C96144vs(str2))));
                return;
            }
            StringBuilder A0o4 = AnonymousClass001.A0o();
            A0o4.append("MLModelMetadataGraphqlFetcher/fetch/found ml model file url for ");
            A0o4.append("wa_bwe_pl_classifier_mobile");
            A0o4.append(' ');
            C18260x0.A1G(A0o4, this.A00);
            r2 = this.A01;
        }
        r2.invoke(new AnonymousClass3Z9(obj));
    }

    public C114475n6(AnonymousClass4GQ r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public void BQq(IOException iOException) {
        C18260x0.A1Q(C18270x1.A0X(iOException), "MLModelMetadataGraphqlFetcher/onDeliveryFailure/exception: ", iOException);
        this.A01.invoke(new AnonymousClass3Z9(new AnonymousClass3Z0(new C96134vr(iOException))));
    }

    public void BSB(Exception exc) {
        C18260x0.A1Q(C18270x1.A0X(exc), "MLModelMetadataGraphqlFetcher/onError/exception: ", exc);
        this.A01.invoke(new AnonymousClass3Z9(new AnonymousClass3Z0(new C96154vt(exc))));
    }
}
