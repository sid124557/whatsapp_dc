package com.whatsapp.jobqueue.job.messagejob;

import X.AnonymousClass5TD;
import X.C389229y;
import X.C54292oU;
import X.C614530v;
import X.C620633i;
import X.C620733j;
import X.C624134x;
import X.C64333Db;
import X.C64773Ex;
import X.C66533Lu;
import android.content.Context;

public class ProcessVCardMessageJob extends AsyncMessageJob {
    public static final long serialVersionUID = 1;
    public transient C64773Ex A00;
    public transient C620633i A01;
    public transient C54292oU A02;
    public transient C620733j A03;
    public transient C66533Lu A04;
    public transient C614530v A05;
    public transient AnonymousClass5TD A06;

    public ProcessVCardMessageJob(C624134x r5) {
        super(r5.A1L, r5.A1M);
    }

    public void Bm4(Context context) {
        super.Bm4(context);
        C64333Db A012 = C389229y.A01(context);
        this.A02 = A012.BsL();
        this.A06 = (AnonymousClass5TD) A012.AZi.get();
        this.A00 = C64333Db.A26(A012);
        this.A01 = C64333Db.A2o(A012);
        this.A03 = A012.BsW();
        this.A04 = A012.AcK.A00.AL8();
        this.A05 = (C614530v) A012.AZj.get();
    }
}
