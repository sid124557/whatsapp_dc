package X;

/* renamed from: X.63J  reason: invalid class name */
public final class AnonymousClass63J extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ String $annotationKey;
    public final /* synthetic */ String $annotationValue;
    public final /* synthetic */ Integer $instanceKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63J(Integer num, String str, String str2) {
        super(1);
        this.$instanceKey = num;
        this.$annotationKey = str;
        this.$annotationValue = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass316 r6 = (AnonymousClass316) obj;
        C162457s7.A0J(r6, 0);
        Integer num = this.$instanceKey;
        if (num == null) {
            r6.A0C(this.$annotationKey, false, this.$annotationValue);
        } else {
            r6.A0C.markerAnnotate(r6.A0A.A07, num.intValue(), this.$annotationKey, this.$annotationValue);
        }
        return C59022wD.A00;
    }
}
