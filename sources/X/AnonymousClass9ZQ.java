package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.onecamera.corecomponents.threading.basic.ThreadPoolImpl$LifeStatus;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9ZQ  reason: invalid class name */
public abstract class AnonymousClass9ZQ implements C185578tu {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    public final void B1l() {
        AnonymousClass9SC r3;
        if (!this.A03) {
            throw AnonymousClass001.A0e("Observer not initialized.");
        } else if (this.A01) {
            if (this.A00) {
                if ((this instanceof C1903996a) && (r3 = ((C1903996a) this).A01) != null) {
                    C194799Un.A00(r3.A09, "p");
                    r3.A03.post(new C199799hG(r3, new AnonymousClass9Z1(r3)));
                }
                this.A00 = false;
            }
            this.A01 = false;
        }
    }

    public final void BFn() {
        String str;
        Map map;
        HandlerThread handlerThread;
        AnonymousClass9SC r14;
        if (!this.A03) {
            this.A03 = true;
            this.A02 = true;
            this.A00 = false;
            if (this instanceof C1903996a) {
                C1903996a r7 = (C1903996a) this;
                AnonymousClass9LH r0 = C203689o9.A00;
                C203449ni r5 = r7.A00;
                C203689o9 r6 = (C203689o9) r5.B5k(r0);
                AnonymousClass9LE r3 = C194719Uf.A01;
                Object B5l = r5.B5l(r3);
                if (B5l != null) {
                    String str2 = (String) B5l;
                    AnonymousClass71V r32 = C203659o6.A00;
                    if (r7.A03) {
                        r7.A02 = (C203659o6) r5.B5j(r32);
                        r5.B5l(AnonymousClass9M1.A00);
                        Context context = r5.getContext();
                        C203669o7 r52 = r7.A00;
                        switch (str2.hashCode()) {
                            case -2109762974:
                                str = "ar_ads_camera";
                                break;
                            case -1872202802:
                                str = "messenger_camera_composer";
                                break;
                            case -1860080918:
                                str = "inspiration";
                                break;
                            case -1344425781:
                                str = "inspiration_camera_shortcut";
                                break;
                            case -1180487979:
                                str = "inspiration_composer";
                                break;
                            case -875891333:
                                str = "inspiration_other";
                                break;
                            case -873570300:
                                str = "inspiration_reels";
                                break;
                            case -817936692:
                                str = "instagram_reels";
                                break;
                            case -725934347:
                                str = "inspiration_composer_comment";
                                break;
                            case -656087042:
                                str = "inspiration_stories";
                                break;
                            case 3628448:
                                str = "vros";
                                break;
                            case 17032470:
                                str = "instagram_direct";
                                break;
                            case 165128166:
                                str = "messenger_camera_chathead";
                                break;
                            case 267394712:
                                str = "messenger_camera_inbox";
                                break;
                            case 287240773:
                                str = "msqrd_player_app";
                                break;
                            case 628042777:
                                str = "messenger_kids";
                                break;
                            case 1268202694:
                                str = "instagram_stories";
                                break;
                            case 2017524177:
                                str = "messenger_camera";
                                break;
                            default:
                                r14 = null;
                                break;
                        }
                        if (str2.equals(str)) {
                            AnonymousClass9LI r4 = new AnonymousClass9LI();
                            AnonymousClass9MC r33 = new AnonymousClass9MC(r4);
                            C194789Um r1 = C194789Um.A02;
                            if (!"audiopipeline_thread".isEmpty()) {
                                synchronized (r1) {
                                    map = r1.A01;
                                    Iterator it = map.keySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((Thread) it.next()).getName().equals("audiopipeline_thread")) {
                                                Object[] A0L = AnonymousClass002.A0L();
                                                A0L[0] = "audiopipeline_thread";
                                                C162477s9.A0F("ThreadPool", "Thread name already exists %s", A0L);
                                            }
                                        }
                                    }
                                    handlerThread = new HandlerThread("DO_NOT_USE_thread", 0);
                                    handlerThread.setName("audiopipeline_thread");
                                }
                                handlerThread.start();
                                if (handlerThread.isAlive()) {
                                    synchronized (r1) {
                                        map.put(handlerThread, ThreadPoolImpl$LifeStatus.AVAILABLE);
                                    }
                                    String name = handlerThread.getName();
                                    if (C162477s9.A01.BI0(4)) {
                                        C162477s9.A07("ThreadPool", StringFormatUtil.formatStrLocaleSafe("New thread started %s with %s priority", name, 0));
                                    }
                                    Handler handler = new Handler(handlerThread.getLooper(), (Handler.Callback) null);
                                    r1.A00.put(handler, handlerThread);
                                    synchronized (r1) {
                                        map.put(handlerThread, ThreadPoolImpl$LifeStatus.TAKEN);
                                    }
                                    C162477s9.A05(Integer.valueOf(map.size()), "ThreadPool", "Number of threads in pool: %d");
                                    AnonymousClass9MC r17 = r33;
                                    Handler handler2 = handler;
                                    r14 = new AnonymousClass9SC(context, handler2, r17, new C194799Un(), r6, r52, r4);
                                    r7.A01 = r14;
                                    return;
                                }
                                throw AnonymousClass002.A0E("Thread start was unsuccessful");
                            }
                            throw AnonymousClass002.A0E("Thread name cannot be empty");
                        }
                        r14 = null;
                        r7.A01 = r14;
                        return;
                    }
                    throw AnonymousClass001.A0e("Component not initialized.");
                }
                throw AnonymousClass000.A0E(r3, "Configuration is not available: ", AnonymousClass001.A0o());
            }
        }
    }

    public final void BFy() {
        if (!this.A03) {
            throw AnonymousClass001.A0e("Observer not initialized.");
        }
    }

    public final void connect() {
        if (!this.A03) {
            throw AnonymousClass001.A0e("Observer not initialized.");
        } else if (!this.A01) {
            this.A01 = true;
            if (this.A02) {
                this.A00 = true;
            }
        }
    }

    public final void release() {
        if (this.A03) {
            if (this instanceof C1903996a) {
                C1903996a r5 = (C1903996a) this;
                AnonymousClass9SC r4 = r5.A01;
                if (r4 != null) {
                    C194799Un r3 = r4.A09;
                    C194799Un.A00(r3, "p");
                    AnonymousClass9Z1 r2 = new AnonymousClass9Z1(r4);
                    Handler handler = r4.A03;
                    handler.post(new C199799hG(r4, r2));
                    C194799Un.A00(r3, "d");
                    handler.post(new C198599fB(r4));
                }
                r5.A02 = null;
                r5.A01 = null;
            }
            this.A02 = false;
            this.A03 = false;
            this.A00 = false;
        }
    }
}
