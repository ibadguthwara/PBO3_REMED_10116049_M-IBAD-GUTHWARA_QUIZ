package pbo3_remed_10116049_m.ibad.guthwara_quiz;

/**
 *
 * @author ibadguthwara
 */
    public interface ServiceItem {
        public void displayService();
        public float getPrice(int serviceItem);
        public boolean checkMemberStatus(String statusMember);
        public float getSale(boolean isMember, float parServicePrice);
}

