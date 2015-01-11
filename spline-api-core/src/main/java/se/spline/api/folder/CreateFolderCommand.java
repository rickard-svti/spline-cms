package se.spline.api.folder;

public class CreateFolderCommand extends FolderCommand {
	private final String name;
	private final FolderId parentId;

	public CreateFolderCommand(FolderId id, String name, FolderId parentId) {
		super(id);
		this.name = name;
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public FolderId getParentId() {
		return parentId;
	}
}
