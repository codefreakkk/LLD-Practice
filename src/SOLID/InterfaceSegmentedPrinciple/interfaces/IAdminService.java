package SOLID.InterfaceSegmentedPrinciple.interfaces;

public interface IAdminService {
    void promoteToAdmin(int userId);
    void demoteFromAdmin(int userId);
}
