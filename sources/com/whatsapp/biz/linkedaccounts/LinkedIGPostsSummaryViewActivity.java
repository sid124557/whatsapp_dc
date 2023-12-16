package com.whatsapp.biz.linkedaccounts;

import X.AnonymousClass2XT;
import X.AnonymousClass4L0;
import X.AnonymousClass4SG;
import X.AnonymousClass4UW;
import X.AnonymousClass65M;
import X.AnonymousClass80Q;
import X.C107695bk;
import X.C109685f1;
import X.C114495n8;
import X.C121215zr;
import X.C121225zs;
import X.C121235zt;
import X.C153127ai;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C53682nU;
import X.C64333Db;
import X.C86604Kt;
import X.C88834as;
import X.C89644eZ;
import X.C989153s;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCardGrid;

public final class LinkedIGPostsSummaryViewActivity extends C89644eZ {
    public Toolbar A00;
    public AnonymousClass2XT A01;
    public AnonymousClass4UW A02;
    public UserJid A03;
    public C153127ai A04;
    public C989153s A05;
    public AnonymousClass65M A06;
    public MediaCardGrid A07;
    public boolean A08;

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            this.A06 = (AnonymousClass65M) A2W.A25.get();
            this.A05 = (C989153s) r1.A6x.get();
            this.A04 = (C153127ai) r1.A6w.get();
            this.A01 = (AnonymousClass2XT) r1.A71.get();
        }
    }

    public LinkedIGPostsSummaryViewActivity(int i) {
        this.A08 = false;
        C86604Kt.A1K(this, 16);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        C162457s7.A0D(intent);
        AnonymousClass65M r3 = this.A06;
        if (r3 != null) {
            C989153s r2 = this.A05;
            if (r2 != null) {
                C153127ai r1 = this.A04;
                if (r1 != null) {
                    AnonymousClass4UW r0 = (AnonymousClass4UW) AnonymousClass4L0.A0F(new AnonymousClass80Q(intent, r1, r2, r3), this).A01(AnonymousClass4UW.class);
                    this.A02 = r0;
                    if (r0 == null) {
                        throw C18270x1.A0S("linkedIGPostsSummaryViewModel");
                    }
                    C86604Kt.A1N(this, r0.A08, new C121215zr(this), 34);
                    AnonymousClass4UW r02 = this.A02;
                    if (r02 == null) {
                        throw C18270x1.A0S("linkedIGPostsSummaryViewModel");
                    }
                    C86604Kt.A1N(this, r02.A07, new C121225zs(this), 35);
                    AnonymousClass4UW r03 = this.A02;
                    if (r03 == null) {
                        throw C18270x1.A0S("linkedIGPostsSummaryViewModel");
                    }
                    C86604Kt.A1N(this, r03.A06, new C121235zt(this), 36);
                    AnonymousClass4UW r22 = this.A02;
                    if (r22 == null) {
                        throw C18270x1.A0S("linkedIGPostsSummaryViewModel");
                    }
                    UserJid userJid = (UserJid) r22.A00.getParcelableExtra("jid");
                    if (userJid != null) {
                        r22.A01 = userJid;
                        this.A03 = userJid;
                        setContentView((int) R.layout.f8nameremoved);
                        Toolbar toolbar = (Toolbar) C18290x4.A0N(this, R.id.ig_posts_toolbar);
                        this.A00 = toolbar;
                        if (toolbar == null) {
                            throw C18270x1.A0S("toolbar");
                        }
                        toolbar.setTitle((int) R.string.f11nameremoved);
                        C86604Kt.A11(toolbar.getContext(), toolbar, this.A00, R.drawable.ic_back_gray);
                        toolbar.setNavigationOnClickListener(new C109685f1((Object) this, 46));
                        MediaCardGrid mediaCardGrid = (MediaCardGrid) C18290x4.A0N(this, R.id.media_card_grid);
                        this.A07 = mediaCardGrid;
                        if (mediaCardGrid == null) {
                            throw C18270x1.A0S("mediaCard");
                        }
                        mediaCardGrid.setTitle(getString(R.string.f11nameremoved));
                        MediaCardGrid mediaCardGrid2 = this.A07;
                        if (mediaCardGrid2 == null) {
                            throw C18270x1.A0S("mediaCard");
                        }
                        mediaCardGrid2.A08((View.OnClickListener) null, 3);
                        AnonymousClass4UW r23 = this.A02;
                        if (r23 == null) {
                            throw C18270x1.A0S("linkedIGPostsSummaryViewModel");
                        }
                        MediaCardGrid mediaCardGrid3 = this.A07;
                        if (mediaCardGrid3 == null) {
                            throw C18270x1.A0S("mediaCard");
                        }
                        AnonymousClass65M r12 = r23.A04;
                        UserJid userJid2 = r23.A01;
                        if (userJid2 == null) {
                            throw C18270x1.A0S("bizJid");
                        }
                        C114495n8 B0B = r12.B0B(r23.A09, new C53682nU(userJid2, mediaCardGrid3.getThumbnailPixelSize(), mediaCardGrid3.getThumbnailPixelSize(), 1, true, true, true));
                        r23.A05 = B0B;
                        B0B.A00();
                        AnonymousClass2XT r24 = this.A01;
                        if (r24 != null) {
                            UserJid userJid3 = this.A03;
                            if (userJid3 == null) {
                                throw C18270x1.A0S("bizJid");
                            }
                            r24.A00(userJid3, 0);
                            return;
                        }
                        throw C18270x1.A0S("linkedIGPostsLoggingHelper");
                    }
                    finish();
                    return;
                }
                throw C18270x1.A0S("imageLoader");
            }
            throw C18270x1.A0S("cacheManager");
        }
        throw C18270x1.A0S("serviceFactory");
    }

    public LinkedIGPostsSummaryViewActivity() {
        this(0);
    }
}
